package com.kovko.runner;

import com.kovko.input.TranslationInput;
import com.kovko.output.TranslationOutput;
import com.kovko.translator.Translator;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Translator translator = context.getBean(Translator.class);
        TranslationInput translationInput = context.getBean(TranslationInput.class);
        TranslationOutput translationOutput = context.getBean(TranslationOutput.class);

        List<String> words = translationInput.input(args);
        Map<String, String> definitions = translator.translate(words);
        translationOutput.output(definitions);
    }
}

