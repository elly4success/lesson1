package com.elijah.lesson1;

public class Functions {

    /*
    Types: Parameterized and non parameterized
    1.Defined functions
    2. Small defined tasks
     */

    public static void main(String[] args) {

        System.out.println(add());
        System.out.println(div());
        //System.out.println(name);
        print();

    }

    //Access Modifier
    public static int add() {
        int a = 6;
        int b = 34;
        int sum = a + b;

        return sum;

    }

    public static double div() {
        int a = 6;
        int b = 34;
        int div = a / b;

        return div;

    }

    public static void print(){
        String name = "Elly";
        System.out.println(name);
    }
}
