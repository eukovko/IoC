package com.kovko.module;

import com.google.inject.AbstractModule;
import com.kovko.dictionary.DictProtocolDictionary;
import com.kovko.dictionary.Dictionary;
import com.kovko.translator.BasicTranslator;
import com.kovko.translator.Translator;

public class BasicModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(Translator.class).to(BasicTranslator.class);
        bind(Dictionary.class).toInstance(new DictProtocolDictionary("dict.org"));
    }
}
