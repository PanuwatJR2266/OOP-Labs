package Lab2.Q4;

public class Father extends Parent{
    protected Mother wife;

    public Father(Mother wife){
        super();
        this.wife = wife;
    }

    @Override
    public String getFirstName(){
        return "Mr."+this.firstName;
    }
}
