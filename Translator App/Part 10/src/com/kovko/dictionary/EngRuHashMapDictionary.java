package com.kovko.dictionary;

import java.util.HashMap;
import java.util.Locale;

public class EngRuHashMapDictionary implements Dictionary {

    private final HashMap<String, String> translations;

    public EngRuHashMapDictionary() {
        translations = new HashMap<>();
        translations.put("car", "автомобиль");
        translations.put("window", "окно");
        translations.put("table", "стол");
        translations.put("money", "деньги");
        translations.put("computer", "компьютер");
        translations.put("road", "дорога");
    }

    @Override
    public String lookUp(String text) {
        return translations.get(text.toLowerCase(Locale.US).trim());
    }
}
