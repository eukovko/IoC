package com.kovko.injector;

import java.util.HashMap;
import java.util.Map;

public class Injector {

	private Map<Class<?>, Object> context = new HashMap<>();

	public Injector() {
//		registerService();
	}

	public <T> void registerService(Class<T> type, T service){
		context.put(type, service);
	}
}
