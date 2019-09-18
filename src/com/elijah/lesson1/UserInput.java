package com.elijah.lesson1;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.next();
        System.out.println("Enter your age");
        int age = input.nextInt();
        System.out.println(name);
        System.out.println(age);
        System.out.println("Your name is: " +name + " and you are " + age + "years old.");


        //Functions
        Functions f1 = new Functions();

        System.out.println(f1.add());

    }
}
