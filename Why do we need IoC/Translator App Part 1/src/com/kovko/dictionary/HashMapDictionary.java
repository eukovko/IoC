package com.kovko.dictionary;

import java.util.HashMap;
import java.util.Locale;

public class HashMapDictionary implements Dictionary {

    private HashMap<String, String> translations;

    public HashMapDictionary() {
        translations = new HashMap<>();
        translations.put("car", "автомобиль");
        translations.put("cat", "кот");
    }

    @Override
    public String lookUp(String text) {
        return translations.get(text.toLowerCase(Locale.US).trim());
    }
}
