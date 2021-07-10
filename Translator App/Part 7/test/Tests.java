import org.junit.jupiter.api.Test;
import com.kovko.translator.Translator;
import static org.assertj.core.api.Assertions.assertThat;

class Tests {
    @Test
    void testConstructor() {
      for (java.lang.reflect.Constructor<?> declaredConstructor : Translator.class.getDeclaredConstructors()) {
        int parameterCount = declaredConstructor.getParameterCount();
        assertThat(parameterCount)
            .as("There should only one parameter in the Translator.\n" +
                "The instance of Dictionary should be passed to the constructor.\n")
            .isEqualTo(1);
      }
  }
}