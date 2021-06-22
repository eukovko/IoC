package com.kovko.runner;

import com.kovko.engine.Engine;
import com.kovko.vehicle.Car;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine();
        Car car = new Car(engine);
        car.turnLeft();
        car.turnRight();
        car.drive();
        car.stop();
    }
}
