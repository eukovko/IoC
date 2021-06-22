package com.kovko.vehicle;

import com.kovko.engine.Engine;

public class Car {

    private final Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void turnLeft() {
        System.out.println("Turning left");
    }

    public void turnRight() {
        System.out.println("Turn right");
    }

    public void drive() {
        engine.start();
        System.out.println("Enjoy the ride");
    }

    public void stop() {
        System.out.println("Enjoy the view");
    }
}
