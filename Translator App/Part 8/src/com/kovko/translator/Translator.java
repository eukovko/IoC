package com.kovko.translator;

import com.kovko.dictionary.Dictionary;

public class Translator {

    private final Dictionary dictionary;

    public Translator(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    public String translate(String word) {
        return dictionary.lookUp(word);
    }
}
