package com.kovko.dictionary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Locale;

public class EngRuCsvFileDictionary implements Dictionary {

    private static final String DELIMITER = ",";
    private final HashMap<String, String> translations;

    public EngRuCsvFileDictionary(String fileName) {
        Charset charset = Charset.forName("UTF-8");
        Locale sourceLocale = new Locale("us");
        Locale targetLocale = new Locale("ru");
        translations = new HashMap<>();

        try (InputStream stream = getClass().getClassLoader().getResourceAsStream(fileName);
             InputStreamReader inputStreamReader = new InputStreamReader(stream, charset);
             BufferedReader reader = new BufferedReader(inputStreamReader)) {
            for (String line = reader.readLine(); line != null; line = reader.readLine()) {
                String[] words = line.split(DELIMITER);
                if (words.length == 2) {
                    String word = words[0].toLowerCase(sourceLocale).strip();
                    String translation = words[1].toLowerCase(targetLocale).strip();
                    translations.put(word, translation);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String lookUp(String text) {
        return translations.get(text.toLowerCase(Locale.US).trim());
    }
}
