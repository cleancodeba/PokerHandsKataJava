package com.cleancodeba;

import com.cleancodeba.play.HigherCardPlay;
import com.cleancodeba.play.PairPlay;
import com.cleancodeba.play.Play;

import java.util.ArrayList;
import java.util.List;

public class PlayCalculator {
	private List<Play> plays;

	public PlayCalculator() {
		this.plays = new ArrayList<>();
		this.plays.add(new PairPlay());
		this.plays.add(new HigherCardPlay());
	}

	public Play playByHand(Hand hand){
		return null;
	}

}
