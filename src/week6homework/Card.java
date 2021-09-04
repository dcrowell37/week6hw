package week6homework;

public class Card {
	String name;
	int value;
	int suit;
	
	
	public Card(int value, int suit) {
		this.value = value;
		this.suit = suit;
		
	}


	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public int getSuit() {
		return suit;
	}
	public void setSuit(int suit) {
		this.suit = suit;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		StringBuilder name = new StringBuilder();
		
		if (value == 11) {
			name.append("Jack");
		} else if (value == 12) {
			name.append("Queen");
		} else if (value == 13) {
			name.append("King");
		} else if (value == 14) {
			name.append("Ace");
		} else { 
			name.append(value);
		}
		
		name.append(" of ");
		
		if (suit == 0) {
			name.append("Clubs");
		} else if (suit == 1) {
			name.append("Diamonds");
		} else if (suit == 2) {
			name.append("Hearts");
		} else { 
			name.append("Spades");
		}
		return name.toString();
		
	}
	
	
	}
