package com.kovko.translator;

import com.kovko.dictionary.Dictionary;
import com.kovko.dictionary.EngRuCsvFileDictionary;

public class Translator {

    private Dictionary dictionary;

    public Translator(String fileName, String charsetName, String sourceLanguage, String targetLanguage) {
        dictionary = new EngRuCsvFileDictionary(fileName, charsetName, sourceLanguage, targetLanguage);
    }

    public String translate(String word) {
        return dictionary.lookUp(word);
    }
}
