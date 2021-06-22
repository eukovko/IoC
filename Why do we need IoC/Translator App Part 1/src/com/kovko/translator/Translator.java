package com.kovko.translator;

import com.kovko.dictionary.Dictionary;
import com.kovko.dictionary.HashMapDictionary;

public class Translator {

    private final Dictionary dictionary;

    public Translator() {
        dictionary = new HashMapDictionary();
    }

    public String translate(String word) {
        return dictionary.lookUp(word);
    }
}
