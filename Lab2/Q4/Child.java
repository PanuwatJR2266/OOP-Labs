package Lab2.Q4;

public class Child extends Person {
    protected int age;
    protected int height;
    protected double weight;
    protected Person guardian;

    public Child(int a,int h,double w){
        super();
        this.age = a;
        this.height = h;
        this.weight = w;
    }
    
    public void setGuardian(Person g){
        this.guardian = g;
    }

    public Person getGuradian(){
        return this.guardian ;
    }
}
