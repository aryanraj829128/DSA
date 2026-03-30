package oodp2.Staitc;

//this is the demo to initialise static variable

public class Staticblock {
    static int a=4;
    static int b;

    //will only run once when the first obj is created i.e. when the class is loaded for the first time
    static{
        System.out.println("I am in static block");
        b=a*5;
    }

    public static void main(String[] args) {
        Staticblock obj= new Staticblock();
        System.out.println(Staticblock.a+" "+ Staticblock.b);

        Staticblock.b+=3;

        System.out.println(Staticblock.a+" "+ Staticblock.b);
        Staticblock obj2= new Staticblock();
        System.out.println(Staticblock.a+" "+ Staticblock.b);

    }
}
