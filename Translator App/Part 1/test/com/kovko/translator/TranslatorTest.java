package com.kovko.translator;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.assertj.core.api.Assertions.assertThat;

class TranslatorTest {

    @Test
    void testTranslator() throws NoSuchFieldException, IllegalAccessException {
        Translator translator = new Translator();
        Field dictionary = translator.getClass().getDeclaredField("dictionary");
        dictionary.setAccessible(true);
        assertThat(dictionary.get(translator))
                .as("Dictionary in the translator should not be null, please initialize it")
                .isNotNull();
    }
}