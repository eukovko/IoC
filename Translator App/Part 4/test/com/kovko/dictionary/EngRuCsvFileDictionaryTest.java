package com.kovko.dictionary;

import com.kovko.translator.Translator;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.HashMap;


import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class EngRuCsvFileDictionaryTest {

    @Test
    void testConstructor() {
        for (Constructor<?> declaredConstructor : EngRuCsvFileDictionary.class.getDeclaredConstructors()) {
            int parameterCount = declaredConstructor.getParameterCount();
            assertThat(parameterCount)
                    .as("There should be four parameters in the EngRuCsvFileDictionary.\n" +
                            "One for file name, one for charset file is using,\n" +
                            "and the last two for the locales of source and target languages")
                    .isEqualTo(4);
        }
    }

    @Test
    void testTranslatorCapacity() throws NoSuchFieldException, IllegalAccessException {
        Translator translator = new Translator();
        Field declaredField = translator.getClass().getDeclaredField("dictionary");
        declaredField.setAccessible(true);
        Object dictionary = declaredField.get(translator);
        assertThat(dictionary)
                .as("Translator has no dictionary instantiated")
                .isNotNull();
        assertThat(dictionary)
                .as("Translator has a wrong implementation of a dictionary")
                .isInstanceOf(EngRuCsvFileDictionary.class);
        Field translationField = ((EngRuCsvFileDictionary) dictionary).getClass().getDeclaredField("translations");
        translationField.setAccessible(true);
        HashMap translations = (HashMap) translationField.get(dictionary);
        int size = translations.size();
        assertThat(size)
                .as("There not enough translations in the dictionary: " + size +
                        "\nTry to add some new words, \"computer\", \"programmer\", \"mouse\" for example")
                .isGreaterThanOrEqualTo(1000);
    }
}