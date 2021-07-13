import com.google.inject.Guice;
import com.google.inject.Injector;
import com.kovko.dictionary.Dictionary;
import com.kovko.input.WordSource;
import com.kovko.module.ApplicationModule;
import com.kovko.output.TranslationOutput;
import com.kovko.translator.Translator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Tests {
  @Test
  void testSolution() {
    Injector injector = Guice.createInjector(new ApplicationModule());
    WordSource wordSource = injector.getInstance(WordSource.class);
    assertThat(wordSource)
        .as("Injector should provide WordSource service")
        .isNotNull();
    TranslationOutput translationOutput = injector.getInstance(TranslationOutput.class);
    assertThat(translationOutput)
        .as("Injector should provide TranslationOutput service")
        .isNotNull();
    Translator translator = injector.getInstance(Translator.class);
    assertThat(translator)
        .as("Injector should provide Translator service")
        .isNotNull();
    Dictionary dictionary = injector.getInstance(Dictionary.class);
    assertThat(dictionary)
        .as("Injector should provide Dictionary service")
        .isNotNull();
  }
}