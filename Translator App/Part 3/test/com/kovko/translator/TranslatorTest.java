package com.kovko.translator;

import com.kovko.dictionary.EngRuCsvFileDictionary;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.util.HashMap;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class TranslatorTest {

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
        HashMap<String, String> translations = (HashMap<String, String>) translationField.get(dictionary);
        int size = translations.size();
        assertThat(size)
                .as("There not enough translations in the dictionary: " + size +
                        "\nTry to add some new words, \"computer\", \"programmer\", \"mouse\" for example")
                .isGreaterThanOrEqualTo(1000);
    }

}