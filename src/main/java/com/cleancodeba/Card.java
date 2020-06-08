package com.cleancodeba;

public class Card {
	private int value;
	private String suit;
	private String displayValue;

	public Card(String card) {
		displayValue = card;
		value = covertToInt(card);
		suit = card.substring(1,1);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	private int covertToInt(String card) {
		return Integer.parseInt(parseLetters(card.substring(0,1)));
	}

	private static String parseLetters(String value){
		String result = null;
		switch (value){
			case "T":
				result = "10";
				break;
			case "J":
				result = "11";
				break;
			case "Q":
				result = "12";
				break;
			case "K":
				result = "13";
				break;
			case "A":
				result = "14";
				break;
			default:
				result = value;
		}
		return result;
	}

	@Override
	public String toString() {
		return displayValue;
	}

}
