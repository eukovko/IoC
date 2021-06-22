package com.kovko.dictionary;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class HashMapDictionary implements Dictionary {

    private final HashMap<String, String> translations;

    public HashMapDictionary() {
        translations = new HashMap<>();
        translations.put("car", "автомобиль");
        translations.put("cat", "кот");
    }

    protected HashMapDictionary(HashMap<String, String> translations) {
        this.translations = translations;
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
