import com.kovko.dictionary.EngRuCsvFileDictionary;
import com.kovko.translator.Translator;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;

import static org.assertj.core.api.Assertions.assertThat;

class Tests {

	@Test
	void testDictionaryConstructor() {
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
	void testTranslatorConstructor() {
		for (Constructor<?> declaredConstructor : Translator.class.getDeclaredConstructors()) {
			int parameterCount = declaredConstructor.getParameterCount();
			assertThat(parameterCount)
				.as("There should be four parameters in the Translator.\n" +
					"One for file name, one for charset file is using,\n" +
					"and the last two for the locales of source and target languages")
				.isEqualTo(4);
		}
	}
}
