package com.kovko.runner;

import com.kovko.context.Context;
import com.kovko.translator.Translator;

public class Main {
    public static void main(String[] args) {
        Context context = new Context(args);
        String word = "car";
        Translator translator = context.getTranslator();
        String translation = translator.translate(word);
        System.out.println(translation);
    }
}
