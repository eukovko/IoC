package com.kovko.module;

import com.google.inject.AbstractModule;
import com.kovko.dictionary.DictProtocolDictionary;
import com.kovko.dictionary.Dictionary;
import com.kovko.input.ConsoleWordSource;
import com.kovko.input.WordSource;
import com.kovko.output.ConsoleTranslationOutput;
import com.kovko.output.TranslationOutput;

public class ApplicationModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(Dictionary.class).toProvider(() -> new DictProtocolDictionary("dict.org", "fd-eng-rus"));
		bind(WordSource.class).to(ConsoleWordSource.class);
		bind(TranslationOutput.class).to(ConsoleTranslationOutput.class);
	}
}
