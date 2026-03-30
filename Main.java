package oodp2.Staitc;

public class Main {
    public static void main(String[] args) {
        Human kunal= new Human(30, "Kunal",10000,false);
        Human Aryan= new Human(20, "Aryan",10000,true);

        System.out.println(Aryan.name);

//        System.out.println(Aryan.population);//show 1
//        System.out.println(kunal.population);//show 1

        System.out.println(Human.population);//show 2
        System.out.println(Aryan.population);// show 2
        System.out.println(kunal.population);// show 2



    }
}
