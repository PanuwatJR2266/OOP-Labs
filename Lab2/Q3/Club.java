package Lab2.Q3;
public class Club {
        protected String clubName;
        protected int minNumMember;
        protected int numMember;

        public Club(String c, int m) {
            this.clubName = c;
            this.minNumMember = m;
            this.numMember = m;
        }

        public void addMember(int num) {
            this.numMember = this.numMember + num;
            System.out.println("Add Member " + num);
        }

        public void changeName(String newName) {
            this.clubName = newName;
        }

        public int determineBudget() {
            return (this.numMember * 1000);
        }

        public String getName() {
            return this.clubName;
        }

        public void advertise() {
            System.out.println("Please join club: " + clubName);
        }
    }

