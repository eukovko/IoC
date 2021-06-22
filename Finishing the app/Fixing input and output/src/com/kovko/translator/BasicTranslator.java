package com.kovko.translator;

import com.kovko.dictionary.Dictionary;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class BasicTranslator implements Translator {

    private final Dictionary dictionary;

    public BasicTranslator(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    @Override
    public String translate(String text) {
        return dictionary.lookUp(text);
    }

    @Override
    public Map<String, String> translate(String text, String delimiter) {
        return translate(List.of(text.split(delimiter)));
    }

    @Override
    public Map<String, String> translate(List<String> words) {
        // TODO: Add proper implementation
        return new HashMap<>();
    }
}
