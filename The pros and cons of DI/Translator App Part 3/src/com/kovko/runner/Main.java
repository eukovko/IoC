package com.kovko.runner;

import com.kovko.dictionary.CsvFileDictionary;
import com.kovko.dictionary.Dictionary;
import com.kovko.translator.Translator;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        List<String> words = List.of("car", "cat");
        Dictionary dictionary = new CsvFileDictionary("dictionary.csv", StandardCharsets.UTF_8, Locale.ROOT, Locale.ROOT);
        Translator translator = new Translator(dictionary);
        for (String word : words) {
            String translation = translator.translate(word);
            System.out.println(translation);
        }
    }
}

