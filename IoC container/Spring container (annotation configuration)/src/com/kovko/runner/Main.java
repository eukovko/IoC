package com.kovko.runner;

import com.kovko.configuration.ApplicationConfiguration;
import com.kovko.translator.Translator;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        Translator translator = context.getBean(Translator.class);
        List<String> words = Arrays.asList("car", "cat");
        for (String word : words) {
            String translation = translator.translate(word);
            System.out.println(translation);
        }
    }
}

