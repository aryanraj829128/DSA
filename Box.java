package oodp3.inheritance;
//1

public class Box {
    double l;
    double w;
    double h;

    static void greeting(){
        System.out.println("Hey i am in box class");
    }

    Box(){
        this.l=-1;
        this.w=-1;
        this.h=-1;

    }
    Box(double side){
        this.w=side;
        this.l=side;
        this.h=side;
    }
    Box(Box old){
        this.h=old.h;
        this.l=old.l;
        this.w=old.w;
    }
    Box(double l, double h, double w){
        this.h=h;
        this.l=l;
        this.w=w;
    }
    public void information(){
        System.out.println("Running the box");
    }


}
