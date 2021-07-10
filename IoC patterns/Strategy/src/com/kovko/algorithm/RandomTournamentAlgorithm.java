package com.kovko.algorithm;

import com.kovko.team.Match;
import com.kovko.team.Team;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RandomTournamentAlgorithm implements TournamentAlgorithm {
	@Override
	public List<Match> scheduleMatches(List<Team> teams) {
		List<Match> matches = new ArrayList<>();
		if (teams.size() % 2 == 0) {
			Collections.shuffle(teams);
			for (int i = 0; i < teams.size(); i+=2) {
				matches.add(new Match(teams.get(i), teams.get(i + 1)));
			}
		} else {
			throw new IllegalArgumentException("The number of teams should be even");
		}
		return matches;
	}
}
