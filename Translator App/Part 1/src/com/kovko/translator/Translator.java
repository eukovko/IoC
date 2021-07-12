package com.kovko.translator;

import com.kovko.dictionary.Dictionary;
import com.kovko.dictionary.EngRuHashMapDictionary;

public class Translator {

    private final Dictionary dictionary;

    public Translator() {
        this.dictionary = new EngRuHashMapDictionary();
    }

    public String translate(String word) {
        return dictionary.lookUp(word);
    }
}
