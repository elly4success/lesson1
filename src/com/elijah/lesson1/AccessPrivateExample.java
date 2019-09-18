package com.elijah.lesson1;

public class AccessPrivateExample {
    public static void main(String []args){
        AccessModifierPrivate acm = new AccessModifierPrivate();
        acm.c = 5;
        System.out.println(acm.c);
        acm.d = 50;
        System.out.println(acm.d);

        acm.setA(30);
        System.out.println(acm.getA());

        acm.setB(200);
        System.out.println(acm.getB());

    }
}


/*
Create a class "CALCULATOR"
1. Attributes of any data type A and B
Create constructor
Do all types of Arithmetic operation
 */
