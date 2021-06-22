package com.kovko.book;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Book {

    private String text;

    public Book(String fileName) {
        StringBuilder stringBuilder = new StringBuilder();
        try(InputStream inputStream = getClass().getClassLoader().getResourceAsStream(fileName);
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
            for(String line = bufferedReader.readLine(); line!=null; line = bufferedReader.readLine()) {
                stringBuilder.append(line);
            }
            text = stringBuilder.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getText() {
        return text;
    }
}
