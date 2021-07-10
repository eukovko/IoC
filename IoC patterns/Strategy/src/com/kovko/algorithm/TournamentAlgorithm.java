package com.kovko.algorithm;

import com.kovko.team.Match;
import com.kovko.team.Team;

import java.util.List;

public interface TournamentAlgorithm {
	List<Match> scheduleMatches(List<Team> teams);
}
