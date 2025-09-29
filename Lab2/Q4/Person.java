package Lab2.Q4;

public class Person {
    protected String lastName;
    protected String firstName;

    public Person(){
    }

    public void setLastName(String l){
        this.lastName = l; 
    }
    public void setFirstName(String f){
        this.firstName = f;
    }

    public String getLastName(){
        return this.lastName;
    }
    public String getFirstName(){
        return this.firstName;
    }

}
