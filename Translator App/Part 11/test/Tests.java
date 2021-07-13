import com.kovko.configuration.ApplicationConfig;
import com.kovko.dictionary.Dictionary;
import com.kovko.input.WordSource;
import com.kovko.output.TranslationOutput;
import com.kovko.translator.Translator;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

class Tests {
	@Test
	void testSolution() {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		WordSource wordSource = applicationContext.getBean(WordSource.class);
		assertThat(wordSource)
			.as("Injector should provide WordSource service")
			.isNotNull();
		TranslationOutput translationOutput = applicationContext.getBean(TranslationOutput.class);
		assertThat(translationOutput)
			.as("Injector should provide TranslationOutput service")
			.isNotNull();
		Translator translator = applicationContext.getBean(Translator.class);
		assertThat(translator)
			.as("Injector should provide Translator service")
			.isNotNull();
		Dictionary dictionary = applicationContext.getBean(Dictionary.class);
		assertThat(dictionary)
			.as("Injector should provide Dictionary service")
			.isNotNull();
	}
}