package com.kovko.dictionary;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Locale;

@Component
public class HashMapDictionary implements Dictionary {

    private final HashMap<String, String> translations;

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
