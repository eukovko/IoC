package com.kovko.tournament;


import com.kovko.algorithm.TournamentAlgorithm;
import com.kovko.team.Match;
import com.kovko.team.Team;

import java.util.List;

public class BasicTournament implements Tournament {

	private List<Team> teams;
	private TournamentAlgorithm tournamentAlgorithm;

	public BasicTournament(List<Team> teams) {
		this.teams = teams;
	}

	@Override
	public List<Match> scheduleMatches() {
		return tournamentAlgorithm.scheduleMatches(teams);
	}

	public void setTournamentAlgorithm(TournamentAlgorithm tournamentAlgorithm) {
		this.tournamentAlgorithm = tournamentAlgorithm;
	}
}
