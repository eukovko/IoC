package com.kovko.runner;

import com.kovko.container.Container;
import com.kovko.input.WordSource;
import com.kovko.output.TranslationOutput;
import com.kovko.translator.Translator;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        WordSource wordSource = container.getService(WordSource.class);
        TranslationOutput translationOutput = container.getService(TranslationOutput.class);
        Translator translator = container.getService(Translator.class);
        Map<String, String> translationMap = new HashMap<>();
        for (String word : wordSource.getWords()) {
            translationMap.put(word, translator.translate(word));
        }
        translationOutput.writeTranslations(translationMap);
    }
}
