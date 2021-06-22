package com.kovko.runner;

import com.kovko.translator.Translator;

public class Main {
    public static void main(String[] args) {
        String word = "cat"; // word to translate
        Translator translator = new Translator(); // creation of a translator instance
        String translation = translator.translate(word); // translating
        System.out.println(translation); // printing translation to console
    }
}
