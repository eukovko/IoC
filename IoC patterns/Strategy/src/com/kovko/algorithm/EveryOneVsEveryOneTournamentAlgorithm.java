package com.kovko.algorithm;

import com.kovko.team.Match;
import com.kovko.team.Team;

import java.util.ArrayList;
import java.util.List;

public class EveryOneVsEveryOneTournamentAlgorithm implements TournamentAlgorithm {
	@Override
	public List<Match> scheduleMatches(List<Team> teams) {
		List<Match> matches = new ArrayList<>();
		for (int i = 0; i < teams.size(); i++) {
			for (int j = 0; j < teams.size(); j++) {
				if (i!=j) {
					matches.add(new Match(teams.get(i), teams.get(j)));
				}
			}
		}
		return matches;
	}
}
