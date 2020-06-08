package com.cleancodeba;

import com.cleancodeba.play.HigherCardPlay;
import com.cleancodeba.play.PairPlay;
import com.cleancodeba.play.Play;

import java.util.ArrayList;
import java.util.List;

public class Game {
	private List<Play> plays;

	public Game() {
		this.plays = new ArrayList<>();
		this.plays.add(new PairPlay());
		this.plays.add(new HigherCardPlay());
	}

	public Hand whosWinning(Hand whiteHand, Hand blackHand) {
		for (Play play : plays) {
			Hand winner = play.whosWinning(whiteHand, blackHand);
			if (winner != null){
				return winner;
			}
		}
		return null;
	}
}
