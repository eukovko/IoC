package com.kovko.configuration;

import com.kovko.dictionary.DictProtocolDictionary;
import com.kovko.dictionary.Dictionary;
import com.kovko.translator.BasicTranslator;
import com.kovko.translator.Translator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

    @Bean
    public Dictionary dictionary() {
        return new DictProtocolDictionary("dict.org");
    }

    @Bean
    public Translator translator() {
        return new BasicTranslator(dictionary());
    }
}
