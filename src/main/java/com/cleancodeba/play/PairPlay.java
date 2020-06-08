package com.cleancodeba.play;

import com.cleancodeba.Card;
import com.cleancodeba.Hand;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PairPlay extends Play {
	@Override
	public Hand whosWinning(Hand hand, Hand otherHand) {
		Map<Integer, List<Card>> handRepetitions = findCardRep(hand, 2);
		Map<Integer, List<Card>> otherHandRepetitions = findCardRep(otherHand, 2);

		if (otherHandRepetitions.isEmpty() && handRepetitions.isEmpty())
			return null;

		if (!otherHandRepetitions.isEmpty() && !handRepetitions.isEmpty()) {
			int otherHandCardValue = otherHandRepetitions.entrySet().stream().findFirst().get().getKey();
			int handCardValue = handRepetitions.entrySet().stream().findFirst().get().getKey();
			if (handCardValue > otherHandCardValue){
				return hand;
			}
			if (handCardValue < otherHandCardValue){
				return otherHand;
			}
			return null;
		}

		if (otherHandRepetitions.isEmpty()) {
			return hand;
		}

		return otherHand;

	}

	private Map<Integer, List<Card>> findCardRep(Hand otherHand, int value) {
		return otherHand
				.getCards()
				.stream()
				.collect(Collectors.groupingBy(Card::getValue))
				.entrySet()
				.stream()
				.filter(integerListEntry -> integerListEntry.getValue().size() == value)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
	}
}
