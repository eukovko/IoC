package com.kovko.output;

import java.util.Map;

public class ConsoleOutput implements TranslationOutput {

    @Override
    public void output(String word) {
        System.out.println(word);
    }

    @Override
    public void output(Map<String, String> translations) {
        for (Map.Entry<String, String> definition : translations.entrySet()) {
            System.out.println(definition.getKey() + " : " + definition.getValue());
        }
    }
}
