package com.kovko.translator;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class TranslatorTest {

    @ParameterizedTest
    @ValueSource(strings = {"table", "money", "computer", "road"})
    void testTranslate(String word) {
        Translator translator = new Translator();
        String translation = translator.translate(word);
        assertThat(translation)
                .as("There is no translation for word \"" + word + "\"")
                .isNotNull();
    }
}