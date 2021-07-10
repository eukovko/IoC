package com.kovko.runner;

import com.kovko.translator.Translator;

public class Main {
    public static void main(String[] args) {
        String word = "car";
        Translator translator = new Translator();
        String translation = translator.translate(word);
        System.out.println(translation);
    }
}
