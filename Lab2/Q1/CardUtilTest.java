package Lab2.Q1;

public class CardUtilTest {
    public static void main(String[] args) {
        Card card1 = new Card(Rank.ACE, Suite.SPADES);
        Card card2 = new Card(Rank.KING, Suite.HERAT);
        System.out.println("Is card1 the highest card? " + CardUtill.isHighestCard(card1));
        System.out.println("Is card2 the highest card? " + CardUtill.isHighestCard(card2));
    }
}
