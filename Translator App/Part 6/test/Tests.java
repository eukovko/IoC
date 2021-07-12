import com.kovko.dictionary.Dictionary;
import com.kovko.translator.Translator;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;

import static org.assertj.core.api.Assertions.assertThat;

class Tests {
    @Test
    void testConstructor() {
        Constructor<?>[] declaredConstructors = Translator.class.getDeclaredConstructors();
        assertThat(declaredConstructors)
            .as("There should be only one constructor in Translator class")
            .hasSize(1);
        Constructor<?> constructor = declaredConstructors[0];
        assertThat(constructor.getParameterCount())
            .as("There should only one parameter in the Translator")
            .isOne();
        assertThat(constructor.getParameterTypes()[0])
            .as("The instance of Dictionary should be passed to the constructor.")
            .isEqualTo(Dictionary.class);
    }

}