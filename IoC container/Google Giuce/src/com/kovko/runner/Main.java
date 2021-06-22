package com.kovko.runner;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.kovko.dictionary.DictProtocolDictionary;
import com.kovko.dictionary.Dictionary;
import com.kovko.module.BasicModule;
import com.kovko.translator.BasicTranslator;
import com.kovko.translator.Translator;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new BasicModule());
        Translator translator = injector.getInstance(Translator.class);
        List<String> words = List.of("gold", "nose");
        for (String word : words) {
            String translation = translator.translate(word);
            System.out.println(translation);
        }
    }
}

