package com.kovko.runner;

import com.kovko.dictionary.DictProtocolDictionary;
import com.kovko.dictionary.Dictionary;
import com.kovko.translator.Translator;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> words = List.of("gold", "nose");
        Dictionary dictionary = new DictProtocolDictionary("dict.org");
        Translator translator = new Translator(dictionary);
        for (String word : words) {
            String translation = translator.translate(word);
            System.out.println(translation);
        }
    }
}

