package com.kovko.dictionary;

import java.io.*;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class DictProtocolDictionary implements Dictionary {

    private static final int PORT = 2628;
    private static final int TIMEOUT = 15000;
    private static final String DEFINITION_FORMAT = "DEFINE %s %s\r\n";
    private final String host;

    public DictProtocolDictionary(String host) {
        this.host = host;
    }

    @Override
    public String lookUp(String text) {
        String definition;
        try (Socket socket = new Socket(host, PORT)){
            socket.setSoTimeout(TIMEOUT);
            Writer writer = getWriter(socket, StandardCharsets.UTF_8);
            BufferedReader reader = getReader(socket, StandardCharsets.UTF_8);
            definition = define(text, "fd-eng-rus", writer, reader);
            quit(writer);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return definition;
    }

    static String define(String word, String dictionary, Writer writer, BufferedReader reader) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        writer.write(String.format(DEFINITION_FORMAT, dictionary, word));
        writer.flush();
        for (String line = reader.readLine(); line != null; line = reader.readLine()) {
            // If there no definition for this word, we don't provide anything
            if (line.startsWith("552 ")) { // no match
                System.out.println("No definition found for: " + word);
                break;
                // All the status lines should be ignored
            } else if (line.matches("(\\d){3}.*")){
                continue;
                // The line which contains only . shows that this is the end of the data
            } else if (line.trim().equals(".")) {
                break;
                // We append all the translation to the initial StringBuilder
            } else {
                stringBuilder.append(line);
            }
        }
        return stringBuilder.toString();
    }

    private void quit(Writer writer) throws IOException {
        writer.write("quit\r\n");
        writer.flush();
    }

    private BufferedReader getReader(Socket socket, Charset charset) throws IOException {
        InputStream inputStream = socket.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, charset);
        return new BufferedReader(inputStreamReader);
    }

    private Writer getWriter(Socket socket, Charset charset) throws IOException {
        OutputStream outputStream = socket.getOutputStream();
        Writer writer = new OutputStreamWriter(outputStream, charset);
        return new BufferedWriter(writer);
    }
}
