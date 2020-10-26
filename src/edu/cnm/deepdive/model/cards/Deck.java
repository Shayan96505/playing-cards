package edu.cnm.deepdive.model.cards;

public class Deck extends Wash {

  public Deck() {
    for (Suit suit : Suit.values()) {
      for (Rank rank: Rank.values()) {
        Card card = new Card(rank, suit);
        add(card);
      }
    }
  }



}
