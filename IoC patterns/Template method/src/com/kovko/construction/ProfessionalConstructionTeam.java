package com.kovko.construction;

public class ProfessionalConstructionTeam extends ConstructionTeam {

	@Override
	void buildWalls() {
		System.out.println("Walls are even and painted with quality");
	}

	@Override
	void buildRoof() {
		throw new UnsupportedOperationException();
	}

	@Override
	void buildDoors() {
		System.out.println("Doors are very safe and reliable");
	}

	@Override
	void buildWindows() {
		System.out.println("Windows don't let any noise from outside");
	}
}
