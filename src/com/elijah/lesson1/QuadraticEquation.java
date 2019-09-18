package com.elijah.lesson1;
import java.math.*;
import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[]args){


        //Quadratic Equation(ax^2+bx+c=0)
        //x^2 + 3x -4 = 0------Find X

        //-x = -b+sqrt(b^2-4ac)/2a--root2
        //x = -b - sqrt(b^2-4ac)/2a--root1

        //Solution
        //Take User input for A, B , C and X
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value for A:");
        double a = input.nextDouble();
        System.out.print("Enter value for B:");
        double b = input.nextDouble();
        System.out.print("Enter value for C:");
        double c = input.nextDouble();

        //Create two other variables
        double root1 = 0;
        double root2 = 0;
        double discriminant = b * b -4 * a * c;

        //checking
        if (discriminant < 0){
            System.out.println("The roots are Imaginary....");
        }
        if (discriminant == 0){
            System.out.println("The roots are equal....");

            //root = -b / 2* a
            root1 = -b / 2 * a;
            root2 = -b / 2 * a;
        }
        if (discriminant > 0){
            System.out.println("The roots are unequal...");
            root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            root1 = (-b - Math.sqrt(discriminant)) / (2 * a);
        }
        System.out.println("The roots of the quadratic equations are: ");
        System.out.println("Root1 "+ root1);
        System.out.println("Root2 "+ root2);

    }
}
