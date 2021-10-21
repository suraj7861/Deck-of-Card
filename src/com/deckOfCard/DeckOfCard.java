package com.deckOfCard;
import com.deckOfCard.AllotCards;
public class DeckOfCard {

	public static void main(String[] args) {
		//object create
		AllotCards allotcard = new AllotCards();
		//allots cards for each player
		for (int playerNumber = 1; playerNumber <= 4; playerNumber++) {
			allotcard.allotCards(playerNumber);
			System.out.println("cards of Player "  + playerNumber+ ": ");
 			allotcard.print(playerNumber);
		}		
	}				
}
