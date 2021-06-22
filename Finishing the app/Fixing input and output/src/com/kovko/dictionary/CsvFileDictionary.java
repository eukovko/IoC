package com.kovko.dictionary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class CsvFileDictionary implements Dictionary {

    private static final String DELIMITER = ",";
    private final HashMap<String, String> translations;

    public CsvFileDictionary(String fileName, Charset charset, Locale sourceLangLocale, Locale targetLangLocale) {
        translations = new HashMap<>();

        try (InputStream stream = getClass().getClassLoader().getResourceAsStream(fileName);
             InputStreamReader inputStreamReader = new InputStreamReader(stream, charset);
             BufferedReader reader = new BufferedReader(inputStreamReader)) {
            for (String line = reader.readLine(); line != null; line = reader.readLine()) {
                String[] words = line.split(DELIMITER);
                if (words.length == 2) {
                    String word = words[0].toLowerCase(sourceLangLocale).strip();
                    String translation = words[1].toLowerCase(targetLangLocale).strip();
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

    @Override
    public Map<String, String> lookUp(List<String> words) {
        throw new UnsupportedOperationException();
    }
}
