package com.kovko.runner;

import com.kovko.translator.Translator;
import com.kovko.dictionary.Dictionary;
import com.kovko.dictionary.DictProtocolDictionary;

public class Main {
    public static void main(String[] args) {
        String host = args[0];
        String dictionaryName = args[1];
        Dictionary dictionary = new DictProtocolDictionary(host, dictionaryName);
        String word = "car";
        Translator translator = new Translator(dictionary);
        String translation = translator.translate(word);
        System.out.println(translation);
    }
}
