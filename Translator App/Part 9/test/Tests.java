import com.kovko.container.Container;
import com.kovko.dictionary.DictProtocolDictionary;
import com.kovko.dictionary.Dictionary;
import com.kovko.input.ConsoleWordSource;
import com.kovko.input.WordSource;
import com.kovko.output.ConsoleTranslationOutput;
import com.kovko.output.TranslationOutput;
import com.kovko.translator.Translator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Tests {
  @Test
  void testSolution() {
    Container container = new Container();
    container.initialize();
    Dictionary dictionary = container.getService(Dictionary.class);
    assertThat(dictionary)
        .as("Container should provide a Dictionary service")
        .isNotNull()
        .as("Dictionary service provided by Container should be of type Translator")
        .isInstanceOf(DictProtocolDictionary.class);
    Translator translator = container.getService(Translator.class);
    assertThat(translator)
        .as("Container should provide a Translator service")
        .isNotNull()
        .as("Translator service provided by Container should be of type Translator")
        .isInstanceOf(Translator.class);
    WordSource wordSource = container.getService(WordSource.class);
    assertThat(wordSource)
        .as("Container should provide a WordSource service")
        .isNotNull()
        .as("WordSource service provided by Container should be of type ConsoleWordSource")
        .isInstanceOf(ConsoleWordSource.class);
    TranslationOutput translationOutput = container.getService(TranslationOutput.class);
    assertThat(translationOutput)
        .as("Container should provide a TranslationOutput service")
        .isNotNull()
        .as("TranslationOutput service provided by Container should be of type ConsoleTranslationOutput")
        .isInstanceOf(ConsoleTranslationOutput.class);
  }
}