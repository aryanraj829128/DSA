package oodp5;

public class Main {
    public static void main(String[] args) {
        Son son= new Son(30);
        son.career();

        son.normal();

        Daughter daughter=  new Daughter(34);
        daughter.career();

//        The constructor Son(int age) is called with age = 30.
//
//        Inside the Son constructor, it calls super(age);, which means:
//
//        The constructor of the Parent class is called with the same age (30).
//
//        In Parent, this line runs: this.age = age;
//
//        This sets the age field of the Parent part of the Son object to 30.
//
//        After that, the System.out.println(age); prints 30.

        //Parent parent= new Parent(); you can not create object of a abstract class
        Parent.hello();


    }
}
