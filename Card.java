package oop;

public class Card {
	private String name;	//	e.g. 2, 9, Ace, Queen
	private String suit;	//	hearts, clubs, diamonds, spades
	private int value;	//	1-10
	
	public Card(String name, String suit, int value) {
		this.name = name;
		this.suit = suit;
		this.value = value;
	}
	
	public String getName() {
		return this.name;
	}
	public String getSuit() {
		return this.suit;
	}
	public int getValue() {
		return this.value;
	}
}
