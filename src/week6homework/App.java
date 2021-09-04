package week6homework;

import java.util.ArrayList;
import java.util.List;

//Question 2

public class App {

	public static void main(String[] args) {
		//Question 3
		Deck deck = new Deck();
		Player player1 = new Player();
		Player player2 = new Player();
		deck.shuffle(deck);
		
		
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				player1.draw(deck);
			} else {
				player2.draw(deck);
			}
		}
		player1.describe(player1);
		player2.describe(player2);
		for (int i = 0; i < 26; i++) {
		Card c = player1.flip(player1.hand);
		Card d = player2.flip(player2.hand); 
		if (c.value > d.value) {
			player1.incrementScore(player1.score);
		} else if (c.value < d.value) {
			player2.incrementScore(player2.score);
		} else if (c.suit > d.suit) {
				player1.incrementScore(player1.score);
			} else if (c.suit < d.suit) {
				player2.incrementScore(player2.score);
			}
			}
		if (player1.score > player2.score) {
			System.out.println("Player 1 wins!" + " Score: " + player1.score);
		} else if (player1.score < player2.score) {
			System.out.println("Player 2 wins!" + " Score: " + player2.score);
		} else {
			System.out.println("Draw!!");
		}
		}
	}
