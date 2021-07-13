package com.kovko.runner;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.kovko.input.WordSource;
import com.kovko.module.ApplicationModule;
import com.kovko.output.TranslationOutput;
import com.kovko.translator.Translator;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new ApplicationModule());
        WordSource wordSource = injector.getInstance(WordSource.class);
        TranslationOutput translationOutput = injector.getInstance(TranslationOutput.class);
        Translator translator = injector.getInstance(Translator.class);
        Map<String, String> translationMap = new HashMap<>();
        for (String word : wordSource.getWords()) {
            translationMap.put(word, translator.translate(word));
        }
        translationOutput.writeTranslations(translationMap);
    }
}
