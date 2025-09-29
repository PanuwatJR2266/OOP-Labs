package Lab2.Q2;

public class PlayerTest {
    public static void main(String[] args) {
        FootballPlayer f = new FootballPlayer("Ronaldo", 7);
        BasketballPlayer b = new BasketballPlayer("James", 23);

        f.print();
        b.print();

        f.playGame();
        b.playGame();

        System.out.println("Football minutes: " + f.getMinutePlayed());
        System.out.println("Basketball minutes: " + b.getMinutePlayed());

        b.changeJerseyNumber(6);
    }
}
