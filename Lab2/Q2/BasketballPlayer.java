package Lab2.Q2;

public class BasketballPlayer extends Player {

    public BasketballPlayer(String n, int j) {
        super(n, j);
    }

    public void playGame() {
        minutesPlayed = minutesPlayed + 48;
    }
}
