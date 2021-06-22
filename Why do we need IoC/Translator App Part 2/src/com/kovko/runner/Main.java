package com.kovko.runner;


import com.kovko.translator.Translator;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> words = List.of("car", "cat");
        Translator translator = new Translator();
        for (String word : words) {
            String translation = translator.translate(word);
            System.out.println(translation);
        }
    }
}

