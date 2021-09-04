package week6homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

//Question1
//b
public class Deck {
	public static int nCards = 52;
	public static ArrayList<Card> Deck;
	
	public Deck() {
		Deck = new ArrayList<Card>();
		int[] suits = new int[4];
		int value;
		suits[0] = 0;
		suits[1] = 1;
		suits[2] = 2;
		suits[3] = 3;
		
		for (int i = 0; i < 4; i++) {
			for (int j = 1; j <= 13; j++) {
				if (j ==1) {
					value = 2;
				} else if (j == 2) {
					value = 3;
				} else if  (j == 3) {
					value = 4;
				} else if (j == 4) {
					value = 5;
				} else if (j == 5) {
					value = 6;
				} else if (j == 6) {
					value = 7;
				} else if (j == 7) {
					value = 8;
				} else if (j == 8) {
					value = 9;
				} else if (j == 9) {
					value = 10;
				} else if (j == 10) {
					value = 11;
				} else if (j == 11) {
					value = 12;
				} else if (j == 12) {
					value = 13;
				} else if (j == 13) {
					value = 14;
				} else {
					value = 0;
				}
				Deck.add(new Card(value, suits[i]));
				}
			}							
	}
	
	public void printDeck() {
		for (int i = 0; i < nCards; i++) {
            System.out.println(Deck.get(i).toString());
		}
	}
	public void shuffle(Deck deck) {
		
		Collections.shuffle(Deck);
		
//		Random random = new Random();
//		
//		for (int i = Deck.size() - 1; i >= 1; i--) {
//			int j = random.nextInt(i + 1);
//			
//			Card card = Deck.get(i);
//			Deck.set(i, Deck.get(j));
//			Deck.set(j, card);
			
			
		}
	public static Card drawCard(Deck deck) {
		Deck.remove(Deck.size() - 1);
		return(Deck.get(Deck.size() - 1));
	}

	public int size() {
		return Deck.size();
	}

	public Card get(int i) {
		return Deck.get(i);
	}

	public static void remove(Card card) {
		Deck.remove(card);
		
	}
		
	}
	

