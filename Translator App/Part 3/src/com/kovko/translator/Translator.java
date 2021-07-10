package com.kovko.translator;

import com.kovko.dictionary.Dictionary;
import com.kovko.dictionary.EngRuCsvFileDictionary;


public class Translator {

    private Dictionary dictionary;

    public Translator() {
        dictionary = new EngRuCsvFileDictionary("dictionary.csv");
    }

    public String translate(String word) {
        return dictionary.lookUp(word);
    }
}
