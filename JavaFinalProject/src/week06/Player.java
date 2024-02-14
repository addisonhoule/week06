package week06;

import java.util.ArrayList;
import java.util.List;

public class Player {

	public List<Card> hand = new ArrayList<Card>();
	private int score=0;
	private String name;
	
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return this.score;
	}


//	print out player information including hand
	public void describe() {
		System.out.println(name + " has " + score + " points.");
		System.out.print("Their hand is: \n");
		for (Card card : hand) {
			card.describe();
		}
		System.out.println("-----------");
	}
	
//	flip method, removes and returns top card of hand
	public Card flip() {
		Card topCard = this.hand.remove(0);
		return topCard;
	}
	
//	draw takes Deck as argument and calls the draw method adding returned Card to hand
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	
//	increment score: add 1 to Player's score
	public void incrementScore() {
		score++;
	}
}
