package com.kovko.appliance;

import com.kovko.light.LightBulb;

public class BasicLightSource {

    private LightBulb lightBulb;

    public void changeLightBulb(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
    }

    public void turnOn() {
        if (lightBulb != null && lightBulb.isWorking()) {
            System.out.println("The light is on");
        } else {
            System.out.println("Nothing is really happening");
        }
    }

    public void turnOff() {
        if (lightBulb != null && lightBulb.isWorking()) {
            System.out.println("The light is off");
        } else {
            System.out.println("Nothing is really happening");
        }
    }
}
