package oodp5.Interfaces;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//        car.acc();
//        car.brake();
//        car.stop();
//        car.start();

        //when you call one function from child classs and that function available on the parent clss
        //then parent class and child class both have to  be present at compile time

//        Media carmedia= new Car();
//        carmedia.stop();

        NiceCar car= new NiceCar();

        car.start();
        car.startMusic();

    }
}
