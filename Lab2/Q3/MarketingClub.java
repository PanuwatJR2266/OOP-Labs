package Lab2.Q3;
public class MarketingClub extends Club {
    protected int budget;
    public MarketingClub(String c,int m,int budget){
        super(c,m);
        this.budget = budget;
    }
    public void changeName(String newName){
        System.out.println("Can't Change clubName");
    }
    public boolean useBudget(int ExpensesBudget){
        System.out.println("ExpensesBudget : "+ExpensesBudget);
        if(this.budget - ExpensesBudget >= 0){
            this.budget -= ExpensesBudget;
            return true;
        }
        else{
            return false;
        }
    }

    public int determineBudget(){
        if(this.budget > 1000){
            return 0;
        }
        else{
            return super.determineBudget();
        }
    }
    public int getBudget(){
        return this.budget;
    }
}
