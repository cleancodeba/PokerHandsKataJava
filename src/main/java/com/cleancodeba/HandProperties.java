package com.cleancodeba;

public class HandProperties {
	private int hearts;
	private int diamonds;
	private int spades;
	private int clubs;

	public HandProperties() {
	}

	public void addHeart(){
		hearts++;
	}

	public void addDiamond(){
		diamonds++;
	}

	public void addSpades(){
		spades++;
	}

	public void addClubs(){
		clubs++;
	}

	public int getHearts() {
		return hearts;
	}

	public int getDiamonds() {
		return diamonds;
	}

	public int getSpades() {
		return spades;
	}

	public int getClubs() {
		return clubs;
	}
}
