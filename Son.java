package oodp5;

public class Son extends Parent{

    public Son(int age){
        super(age);
        //this.age=age;
        System.out.println(age);

    }
    @Override
    void normal() {
        super.normal();
    }

    void career(){
        System.out.println("I am going to be a doctor");
    }

    void partner(){
        System.out.println("I love she");

    }
}
