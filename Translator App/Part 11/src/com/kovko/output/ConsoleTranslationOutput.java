package com.kovko.output;

import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class ConsoleTranslationOutput implements TranslationOutput {
	@Override
	public void writeTranslations(Map<String, String> translations) {
		translations.forEach((word, translation) -> {
			System.out.println(word + " : " + translation);
		});
	}
}
