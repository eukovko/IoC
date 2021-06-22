package com.kovko.translator;

import com.kovko.dictionary.Dictionary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class BasicTranslator implements Translator {

    private final Dictionary dictionary;

    @Autowired
    public BasicTranslator(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    @Override
    public String translate(String text) {
        return dictionary.lookUp(text);
    }
}
