package Lab2.Q3;

public class ClubTest {
    public static void main(String[] args) {

        SportClub a = new SportClub("SportClub", 7);
        System.out.println("=== Sport Club Info ===");
        System.out.println("Club Name: " + a.getName());
        System.out.println("Minimum Members Required: " + a.minNumMember);
        System.out.println("Current Members: " + a.numMember);

        a.addMember(2);
        System.out.println("------- After Adding Members -------");
        System.out.println("Current Members: " + a.numMember);

        a.changeName("HackerClub");
        System.out.println("Estimated Club Budget: " + a.determineBudget());
        a.advertise();

        System.out.println("\n");

        MarketingClub m = new MarketingClub("MarketingClub 1", 12, 50000);
        System.out.println("=== Marketing Club Info ===");
        System.out.println("Club Name: " + m.getName());
        System.out.println("Minimum Members Required: " + m.minNumMember);
        System.out.println("Current Members: " + m.numMember);

        m.addMember(7);
        System.out.println("------- After Adding Members -------");
        System.out.println("Current Members: " + m.numMember);

        m.changeName("HackerClub");
        System.out.println("Available Budget: " + m.getBudget());
        System.out.println("Attempt to Use 20000: " + m.useBudget(20000));
        System.out.println("Estimated Club Budget: " + m.determineBudget());
        m.advertise();

        System.out.println("\n");

        MarketingClub m2 = new MarketingClub("MarketingClub 2", 12, 500);
        System.out.println("=== Marketing Club Info ===");
        System.out.println("Club Name: " + m2.getName());
        System.out.println("Minimum Members Required: " + m2.minNumMember);
        System.out.println("Current Members: " + m2.numMember);

        m2.addMember(7);
        System.out.println("------- After Adding Members -------");
        System.out.println("Current Members: " + m2.numMember);

        m2.changeName("HackerClub");
        System.out.println("Available Budget: " + m2.getBudget());
        System.out.println("Attempt to Use 11000: " + m2.useBudget(11000));
        System.out.println("Estimated Club Budget: " + m2.determineBudget());
        m2.advertise();
    }
}
