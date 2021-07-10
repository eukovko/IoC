package com.kovko.runner;

import com.kovko.translator.Translator;
import com.kovko.dictionary.Dictionary;
import com.kovko.dictionary.EngRuCsvFileDictionary;

public class Main {
    public static void main(String[] args) {
        String fileName = args[0];
        String charsetName = args[1];
        String sourceLanguage = args[2];
        String targetLanguage = args[3];
        Dictionary dictionary = new EngRuCsvFileDictionary(fileName, charsetName, sourceLanguage, targetLanguage);
        String word = "car";
        Translator translator = new Translator(dictionary);
        String translation = translator.translate(word);
        System.out.println(translation);
    }
}
