package com.kovko.team;

public class Match {

	private final Team hostTeam;
	private final Team guestTeam;

	public Match(Team hostTeam, Team guestTeam) {
		this.hostTeam = hostTeam;
		this.guestTeam = guestTeam;
	}

	public Team getHostTeam() {
		return hostTeam;
	}

	public Team getGuestTeam() {
		return guestTeam;
	}
}
