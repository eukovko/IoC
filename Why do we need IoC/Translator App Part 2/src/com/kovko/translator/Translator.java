package com.kovko.translator;

import com.kovko.dictionary.CsvFileDictionary;
import com.kovko.dictionary.Dictionary;

import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class Translator {

    private final Dictionary dictionary;

    public Translator() {
        dictionary = new CsvFileDictionary("dictionary.csv", StandardCharsets.UTF_8, Locale.US, new Locale("ru"));
    }

    public String translate(String text) {
        return dictionary.lookUp(text);
    }
}
