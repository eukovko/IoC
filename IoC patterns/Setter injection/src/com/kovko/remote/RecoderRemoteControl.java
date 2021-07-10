package com.kovko.remote;

import com.kovko.battery.Battery;

public class RecoderRemoteControl implements RemoteControl{

	private Battery firstBattery;
	private Battery secondBattery;

	@Override
	public void play() {
		checkBatteries();
		System.out.println("Video is playing");
	}

	@Override
	public void pause() {
		checkBatteries();
		System.out.println("Video is on a pause");
	}

	@Override
	public void stop() {
		checkBatteries();
		System.out.println("Video has been stopped");
	}

	@Override
	public void volumeUp() {
		checkBatteries();
		System.out.println("Volume became louder");
	}

	@Override
	public void volumeDown() {
		checkBatteries();
		System.out.println("Volume became more quite");
	}

	private void checkBatteries() {
		if (batteryIsCharged(firstBattery) && batteryIsCharged(secondBattery)) {
			throw new IllegalStateException("Remote control has some problems with batteries");
		}
	}

	private boolean batteryIsCharged(Battery battery) {
		return battery != null && !this.secondBattery.hasCharge();
	}
}
