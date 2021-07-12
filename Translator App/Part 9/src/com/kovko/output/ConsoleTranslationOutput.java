package com.kovko.output;

import java.util.Map;

public class ConsoleTranslationOutput implements TranslationOutput {
	@Override
	public void writeTranslations(Map<String, String> translations) {
		translations.forEach((word, translation) -> {
			System.out.println(word + " : " + translation);
		});
	}
}
