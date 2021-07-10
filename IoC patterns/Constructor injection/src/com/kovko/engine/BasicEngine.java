package com.kovko.engine;

public class BasicEngine implements Engine {

	public BasicEngine(Object[] requiredSystems) {
		/*
		* Some complicated code with initialization and resolving dependencies.
		* There too many things to create and they probably can change over time.
		* Also this is only one implementation of the Engine interface,
		* and also can be changed in the future.
		* */
	}

	@Override
	public void start() {
		System.out.println("Engine is started");
	}

	@Override
	public void stop() {
		System.out.println("Engine has been turned off");
	}

}
