package com.deckOfCard;
import java.util.Random;
public class AllotCards {
	//2-d Array 
	int[][] cards = new int[4][13];	
	
	//allots cards for each player
	public void allotCards(int playerNumber) {
		for (int i = 0; i < 9; i++) {
			allotOneCard(playerNumber);
		}
	}
	
	//allots cards to one player
	public void allotOneCard(int playerNumber) {
		//random select suit and rank
		Random random = new Random();
		
		//variables declare and assign random value
		int suit = random.nextInt(4);
		int rank = random.nextInt(13);

		if (cards[suit][rank] != 0) {
			allotOneCard(playerNumber);
		} else {
			cards[suit][rank] = playerNumber;
		}
	}
	
	//Allots only one card randomly
	public void print(int playerNumber) {
		for(int suit = 0; suit < 4; suit++) {
			for(int rank = 0; rank < 13; rank++) {
				if(cards[suit][rank] == playerNumber) {
					System.out.print("'"+ getSuit(suit) + " " + getRank(rank)+"'" + "  ");
				}
			}
		}
		System.out.println("\n");
	}
	
	//get rank 
	String getRank(int rank) {
		switch(rank) {
		case 0:
			return "2";
		case 1:
			return "3";
		case 2:
			return "4";
		case 3:
			return "5";
		case 4:
			return "6";
		case 5:
			return "7";
		case 6:
			return "8";
		case 7:
			return "9";
		case 8:
			return "10";
		case 9:
			return "Jack";
		case 10:
			return "Queen";
		case 11:
			return "King";
		case 12:
			return "Ace";
		default:
			return "";
		}
	}
	//get suit
	String getSuit(int suit) {
		switch(suit) {
		case 0:
			return "Clubs";
		case 1:
			return "Diamonds";
		case 2:
			return "Hearts";
		case 3:
			return "Spades";
		default:
			return "";
		}
	}
}
