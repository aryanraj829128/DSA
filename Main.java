package oodp3.inheritance;

public class Main {
    public static void main(String[] args) {
        Box box= new Box();
//        Box box2=new Box(box);
//        //System.out.println(box.l+" "+box.w+" "+box.h);
//        System.out.println(box2.l+" "+box2.w+" "+box2.h);
//
//        Boxweight box3= new Boxweight();
//        Boxweight box4= new Boxweight(2,3,4,8);
//        System.out.println(box3.weight+" "+ box3.h+" "+box.l+" "+box.w);
//
//        //we use Box class with boxweight object
//        Box box5=new Boxweight(2,3,4,8);
//        //we can access box variables
//        //System.out.println(box5.weight); you can't access weight although it is intialised
//        //it is imp to understand that it is the type of reference variable that determines what members can be accessed
//        //so Box will determine the varibles to be accessed not the boxweight
//
//        //Boxweight box6= new Box(); we can't do this boxweight is child and box is parent
//        Boxprice box= new Boxprice(5,8,200);
//        System.out.println(box.l+" "+box.h+" "+box.w+" "+box.weight+" "+box.cost);

        Box.greeting();
        //why to call using class name for static 
        //Box.greeting();  // Clearly a static method of the Box class
        //box.greeting();  // Looks like it's calling an instance method, but it's actually static

    }
}
