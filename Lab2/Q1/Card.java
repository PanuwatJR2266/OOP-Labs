package Lab2.Q1;

enum Rank {
      THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE
}

enum Suite {
      CLUBS, DIAMOND, HERAT, SPADES
}

public class Card {
      private final Rank rank;
      private final Suite suite;

      public Card(Rank rank, Suite suit) {
            this.rank = rank;
            this.suite = suit;
      }

      public Rank getRank() {
            return rank;
      }

      public Suite getSuite() {
            return suite;
      }
}