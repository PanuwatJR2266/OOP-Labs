package Lab2.Q4;

public class Mother extends Parent{
    protected Father husband;

    public Mother(){
        super();
    }
    
    @Override
    public String getFirstName(){
        return "Ms."+this.firstName;
    }
}
