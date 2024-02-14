package week06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	List<Card> cards = new ArrayList<Card>();

	
//	instantiate deck
	Deck () {
		String[] suits = {"Hearts", "Spades", "Diamonds", "Clubs"};
		String[] numbers = { "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen",
			"King", "Ace"};
	
	for (String suit : suits) {
		int value = 2;
		for (String number : numbers) {
			cards.add(new Card(number, suit, value));
			value++;
		}
	}
	}
	// describe
	public void describe() {
	for (Card card : cards) {
		card.describe();
	}
	}
	
//	shuffle cards use collections.
	public void shuffle() {
		Collections.shuffle(cards);
		
	}

//	draw card
	public Card draw() {
		Card card = this.cards.remove(0);
		return card;
	}


}
