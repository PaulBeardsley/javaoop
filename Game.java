package oop;

import java.util.*;

public class Game {

	public static void main(String[] args) {
		ArrayList<Card> myDeck = getNewPack();
		int x = 36;
		
		System.out.println(myDeck.get(x).getName());
		System.out.println(myDeck.get(x).getSuit());
		System.out.println(myDeck.get(x).getValue());

	}
	public static ArrayList<Card> getNewPack() {
		String[] cards = {
				"Ace Spades","2 Spades","3 Spades","4 Spades","5 Spades",
				"6 Spades","7 Spades","8 Spades","9 Spades","10 Spades",
				"Jack Spades","Queen Spades","King Spades",
				"Ace Hearts","2 Hearts","3 Hearts","4 Hearts","5 Hearts",
				"6 Hearts","7 Hearts","8 Hearts","9 Hearts","10 Hearts",
				"Jack Hearts","Queen Hearts","King Hearts",
				"Ace Clubs","2 Clubs","3 Clubs","4 Clubs","5 Clubs",
				"6 Clubs","7 Clubs","8 Clubs","9 Clubs","10 Clubs",
				"Jack Clubs","Queen Clubs","King Clubs",
				"Ace Diamonds","2 Diamonds","3 Diamonds","4 Diamonds","5 Diamonds",
				"6 Diamonds","7 Diamonds","8 Diamonds","9 Diamonds","10 Diamonds",
				"Jack Diamonds","Queen Diamonds","King Diamonds"
		};
		ArrayList<Card> oDeck = new ArrayList<Card>();
		
		for(String card : cards) {
			String[] pair = card.split(" ");
			String name = pair[0];
			String suit = pair[1];
			int value;
			
			if(name.equals("Ace")) {
				value = 1;
			}
			else if(name.equals("Jack") || name.equals("Queen") || name.equals("King")) {
				value = 10;
			}
			else {
				value = Integer.parseInt(name);
			}
			Card oCard = new Card(name, suit, value);
			oDeck.add(oCard);
		}
		return oDeck;
	}

}
