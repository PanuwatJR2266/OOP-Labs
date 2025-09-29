package Lab2.Q2;

public class Player {
    protected String name;
    protected int jerseyNumber;
    protected int minutesPlayed;

    public Player(String n, int j) {
        name = n;
        jerseyNumber = j;
        minutesPlayed = 0;
    }

    public void print() {
        System.out.println(this.name + ": " + this.jerseyNumber);
    }

    public void changeJerseyNumber(int newNumber) {
        jerseyNumber = newNumber;
        System.out.println(name + "Changes number to " + jerseyNumber);
    }

    public int getMinutePlayed() {
        return this.minutesPlayed;
    }

}
