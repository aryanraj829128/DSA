package oodp5.Interfaces;

public interface Engine {
    //we know java does not support multiple inheritence to resolve this wwe use interfaces
    static final int PRICE = 78000;

    void start();
    void stop();
    void acc();
}
