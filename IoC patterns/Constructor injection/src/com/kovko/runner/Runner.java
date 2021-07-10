package com.kovko.runner;

import com.kovko.vehicle.Car;

public class Runner {
	public static void main(String[] args) {
		Car car = new Car();
		car.drive();
		car.turnLeft();
		car.turnRight();
		car.stop();
	}
}
