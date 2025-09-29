package Lab2.Q4;

public class Parent extends Person {
    protected Child child;
    protected int money;

    public Parent(){
        super();
    }

    public void setChild(Child child){
        this.child = child;
    }
    public Child getChild(){
        return this.child;
    }
}
