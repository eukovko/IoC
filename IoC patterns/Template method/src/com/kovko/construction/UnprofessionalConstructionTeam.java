package com.kovko.construction;

public class UnprofessionalConstructionTeam extends ConstructionTeam {

	@Override
	void buildWalls() {
		System.out.println("Walls are there, but they are shaky");
	}

	@Override
	void buildRoof() {
		System.out.println("Roof is leaking");
	}

	@Override
	void buildDoors() {
		System.out.println("Doors are squeaking");
	}

	@Override
	void buildWindows() {
		throw new UnsupportedOperationException();
	}
}
