package week6homework;

import java.util.ArrayList;
import java.util.List;

//Question 1
//c
public class Player {
	
	ArrayList<Card> hand = new ArrayList<Card>();
	int score = 0;
	String name = "Player";
	
	public void describe(Player player) {
		
		System.out.println("This players name is: " + name);
		System.out.println("Hand: ");
		for (int i = 0; i < hand.size(); i++) {
			
			System.out.println(hand.get(i));
			
		}
		}
	public Card flip(ArrayList<Card> hand) {
		if (hand.size() > 1) {
		hand.remove(hand.get(hand.size() - 1));
		}
		return hand.get(hand.size() - 1 ); }
	public void draw(Deck deck) {
		hand.add(deck.get(deck.size() - 1));
		Deck.remove(deck.get(deck.size() - 1));
	}
	public int incrementScore(int score) {
		this.score = score + 1;
		return score;
	}
		
	}

