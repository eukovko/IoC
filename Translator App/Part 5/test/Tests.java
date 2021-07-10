import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class Tests {

    @Test
    void testConstructor() {
        for (java.lang.reflect.Constructor<?> declaredConstructor : Translator.class.getDeclaredConstructors()) {
            int parameterCount = declaredConstructor.getParameterCount();
            assertThat(parameterCount)
                    .as("There should be four parameters in the Translator.\n" +
                            "One for file name, one for charset file is using,\n" +
                            "and the last two for the locales of source and target languages")
                    .isEqualTo(4);
        }
    }

}