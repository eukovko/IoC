package com.kovko.battery;

public class SimpleBattery implements Battery {

	private int charge;

	public SimpleBattery() {
		this.charge = 10;
	}

	@Override
	public boolean hasCharge() {
		return charge > 0;
	}
}
