package oodp2.Staitc;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population; //if you are writing here Human.population+=1; then do write static here

    public Human(int age, String name, int salary, boolean married){
        this.age= age;
        this.name=name;
        this.salary=salary;
        this.married=married;
        Human.population+=1;

//        this.population+=1;
    }
}
