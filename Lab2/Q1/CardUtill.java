package Lab2.Q1;

public class CardUtill {
    public static final Rank HIGHEST_RANK = Rank.ACE;
    public static final Suite HIGHEST_SUITE = Suite.SPADES;

    public static boolean isHighestCard(Card card) {
        return card.getRank() == HIGHEST_RANK && card.getSuite() == HIGHEST_SUITE;
    }
}