package com.kovko.context;

import com.kovko.dictionary.DictProtocolDictionary;
import com.kovko.dictionary.Dictionary;
import com.kovko.translator.Translator;

import java.util.function.Supplier;

public class Context {

	private Supplier<Dictionary> dictionarySupplier;

	public Context(String[] args) {
		this.dictionarySupplier = () -> new DictProtocolDictionary(args[0], args[1]);
	}

	public Dictionary getDictionary() {
		return dictionarySupplier.get();
	}

	public Translator getTranslator() {
		return new Translator(getDictionary());
	}
}
