package com.kovko.runner;

import com.kovko.translator.Translator;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Translator translator = context.getBean(Translator.class);
        List<String> words = Arrays.asList("gold", "nose");
        for (String word : words) {
            String translation = translator.translate(word);
            System.out.println(translation);
        }
    }
}

