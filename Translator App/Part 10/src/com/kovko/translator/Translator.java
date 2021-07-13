package com.kovko.translator;

import com.google.inject.Inject;
import com.kovko.dictionary.Dictionary;

public class Translator {

    private final Dictionary dictionary;

    @Inject
    public Translator(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    public String translate(String word) {
        return dictionary.lookUp(word);
    }
}
