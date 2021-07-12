package com.kovko.container;

import com.kovko.dictionary.DictProtocolDictionary;
import com.kovko.input.ConsoleWordSource;
import com.kovko.output.ConsoleTranslationOutput;
import com.kovko.translator.Translator;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Container {
	private List<Object> services = new ArrayList<>();
	private Set<Class<?>> components = new HashSet<>();

	public Container() {
		registerComponent(Translator.class);
		registerComponent(ConsoleWordSource.class);
		registerComponent(ConsoleTranslationOutput.class);
		registerService(new DictProtocolDictionary("dict.org", "fd-eng-rus"));
	}

	public <T> T getService(Class<T> componentClass) {
		List<Object> components = services.stream().filter(s -> componentClass.isAssignableFrom(s.getClass())).collect(Collectors.toList());
		if (components.size() > 1) {
			throw new IllegalArgumentException("There too many services");
		} else if (components.size() == 0) {
			throw new IllegalArgumentException("There no available services");
		}
		return ((T) components.get(0));
	}

	public <T> void registerService(T service) {
		services.add(service);
	}

	public void registerComponent(Class<?> componentClass) {
		components.add(componentClass);
	}

	public void initialize() {
		int initialSize;
		do {
			initialSize = components.size();
			Iterator<Class<?>> iterator = components.iterator();
			while (iterator.hasNext()) {
				Class<?> component = iterator.next();
				Constructor<?>[] constructors = component.getDeclaredConstructors();
				if (constructors.length == 1) {
					boolean componentInstantiated = instantiateComponent(constructors[0]);
					if (componentInstantiated) {
						iterator.remove();
					}
				} else {
					throw new IllegalStateException("Component has several constructors");
				}
			}
		} while (initialSize != components.size());
	}

	private boolean instantiateComponent(Constructor<?> constructor) {
		Class<?>[] parameters = constructor.getParameterTypes();
		List<Object> arguments = new ArrayList<>();
		// Try to find appropriate services for the component
		if (parameters.length != 0) {
			for (Class<?> parameter : parameters) {
				arguments.add(getService(parameter));
			}
		}
		// If all the services are available try to create a new service from a component
		if (parameters.length == arguments.size()) {
			try {
				services.add(constructor.newInstance(arguments.toArray()));
				return true;
			} catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
				throw new IllegalStateException("There is an exception during instantiation of a component");
			}
		} else {
			return false;
		}
	}

}
