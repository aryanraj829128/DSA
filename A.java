package oodp4;

public class A {
    protected int num;
    String name;
    int[] arr;
    //if i write like int num only in same package it will allow

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
