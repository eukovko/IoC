package com.kovko.translator;

import com.google.inject.Inject;
import com.kovko.dictionary.Dictionary;


public class BasicTranslator implements Translator {

    private final Dictionary dictionary;

    @Inject
    public BasicTranslator(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    @Override
    public String translate(String text) {
        return dictionary.lookUp(text);
    }
}
