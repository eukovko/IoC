package com.kovko.configuration;

import com.kovko.dictionary.DictProtocolDictionary;
import com.kovko.dictionary.Dictionary;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.kovko")
public class ApplicationConfig {

	@Bean
	public Dictionary dictionary() {
		return new DictProtocolDictionary("dict.org", "fd-eng-rus");
	}
}
