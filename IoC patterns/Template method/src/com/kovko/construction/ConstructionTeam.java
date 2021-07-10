package com.kovko.construction;

public abstract class ConstructionTeam {

	public final void constructBuilding() {
		buildWalls();
		buildRoof();
		buildDoors();
		buildWindows();
	}

	abstract void buildWalls();
	abstract void buildRoof();
	abstract void buildDoors();
	abstract void buildWindows();

}
