package com.cleancodeba;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hand {
	private List<Card> cards;
	private Card higherCard;

	public Hand() {
		cards = new ArrayList<>();
	}

	public Hand(String[] cards) {
		this();
		for (String card : cards) {
			this.addCard(card);
		}
	}

	public void addCard(String card) {
		Card newCard = new Card(card);
		if (higherCard == null || higherCard.getValue() < newCard.getValue())
			higherCard = newCard;



		cards.add(newCard);
	}

	public Card getHigherCard() {
		return higherCard;
	}

	public List<Card> getCards() {
		return cards;
	}
}
