package Lab2.Q3;
public class SportClub extends Club {
    public SportClub(String c,int m){
        super(c,m);
    }
    public void changeName(String newName){
    
        System.out.println("Can't Change ClubName");
    }
    public int determineBudget(){
        return (numMember*1000)+(numMember-minNumMember)*100;
    }

}
