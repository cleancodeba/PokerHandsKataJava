package com.cleancodeba.play;

import com.cleancodeba.Hand;

public class HigherCardPlay extends Play {
	@Override
	public Hand whosWinning(Hand whiteHand, Hand blackHand) {
		int whiteHandHigherCard = whiteHand.getHigherCard().getValue();
		int blackHandHigherCard = blackHand.getHigherCard().getValue();
		if (whiteHandHigherCard > blackHandHigherCard){
			return whiteHand;
		}
		if (blackHandHigherCard > whiteHandHigherCard){
			return blackHand;
		}
		return null;
	}
}
