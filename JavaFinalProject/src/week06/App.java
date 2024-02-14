package week06;

public class App {

	public static void main(String[] args) {
		
//		instantiate two players and deck. Shuffle deck.
		Player player1 = new Player();
		Player player2 = new Player();
		Deck gameDeck = new Deck();
		gameDeck.shuffle();
//			test to check cards
//		gameDeck.describe();
		player1.setName("Puddle Head");
		player2.setName("Jeans the Destroyer");
		System.out.println(player1.getName() + " is Player 1!");
		System.out.println(player2.getName() + " is Player 2!");
		System.out.println("Get ready for some radical card warfare!");
		System.out.println("------------");
		
//		Using for loop, iterate 52 Draw methods from instantiated deck.
		for (int i = 0; i <52; i++) {
			if (i %2==0) {
//			draw to player1 hand
				player1.draw(gameDeck);
			} else {
//				draw to player2 hand
				player2.draw(gameDeck);
			}		
		}
//			test to check where we're at.
//		player1.describe();
//		player2.describe();
		
//		using for loop iterate 26 times the flip method, assigning a point to player with higher score.
//		no points for ties.
		Card p1temp;
		Card p2temp;
		for (int i = 1; i<=26; i++) {
			System.out.println("Round " + i + ":");
			p1temp = player1.flip();
			p2temp = player2.flip();
			p1temp.describe();
			System.out.print(" vs. ");
			p2temp.describe();
			if (p1temp.getValue() > p2temp.getValue()) {
				player1.incrementScore();
				System.out.println(player1.getName() + " gets a point.");
				System.out.println("\t-Score Update- ");
				System.out.println(player1.getName() + ": " + player1.getScore());
				System.out.println(player2.getName() + ": " + player2.getScore());
				System.out.println("------------");
			} else if (p2temp.getValue() > p1temp.getValue()) {
				player2.incrementScore();
				System.out.println(player2.getName() + " gets a point.");
				System.out.println("\t-Score Update- ");
				System.out.println(player1.getName() + ": " + player1.getScore());
				System.out.println(player2.getName() + ": " + player2.getScore());
				System.out.println("------------");
			} else {
				System.out.println("It's a draw. Nobody gets points.");
				System.out.println("\t-Score Update- ");
				System.out.println(player1.getName() + ": " + player1.getScore());
				System.out.println(player2.getName() + ": " + player2.getScore());
				System.out.println("------------");
			}
		}
		
		
//		after loop, compare final score.
//		System.out.println("With a score of: " + player1.getScore() + " to " + player2.getScore() + "...");
		if (player1.getScore() > player2.getScore()) {
//		this should just print out "Player 1"... but it seemed boring.
			System.out.println(player1.getName() + " is the winner!");
		} else 	if (player2.getScore() > player1.getScore()) {
//		this should just print out "Player 2"... but I thought this was more interesting.
			System.out.println(player2.getName() + " is the winner!");
		} else {
//		this should just print out "Draw"... and in a lot of ways it does, but not literally. 
			System.out.println("If they each had one more point, they'd be tied.");
		}
		
		
//		print out winner or draw
		
	}
	
}
