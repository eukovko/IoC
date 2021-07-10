package com.kovko.runner;

import com.kovko.translator.Translator;

public class Main {
    public static void main(String[] args) {
        String fileName = args[0];
        String charsetName = args[1];
        String sourceLanguage = args[2];
        String targetLanguage = args[3];
        String word = "car";
        Translator translator = new Translator(fileName, charsetName, sourceLanguage, targetLanguage);
        String translation = translator.translate(word);
        System.out.println(translation);
    }
}
