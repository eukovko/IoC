import com.kovko.translator.Translator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class Tests {

    @ParameterizedTest
    @MethodSource("translations")
    void testTranslate(String word, String translation) {
        Translator translator = new Translator();
        String actualTranslation = translator.translate(word);
        assertThat(actualTranslation)
            .as("There is no translation for word \"" + word + "\"")
            .isNotNull()
            .as("The translation for the word \"" + word + "\" is wrong, " +
                "should be \"" + translation + "\"" +
                ", but instead it's \"" + actualTranslation + "\"")
            .isEqualTo(translation);
    }

    static Stream<Arguments> translations() {
        return Stream.of(
            arguments("table", "стол"),
            arguments("money", "деньги"),
            arguments("computer", "компьютер"),
            arguments("road", "дорога")
        );
    }
}