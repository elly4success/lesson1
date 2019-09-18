package com.elijah.lesson1;

public class AccessModifierPrivate {

    //Private modifier restricts access by to anything outside the class
    private int a;
    private int b;

    //Public modifier allows anything outside the class
    public int c;
    public int d;

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getB() {
        return b;
    }
}
