import com.elijah.lesson1.Constructor;

import java.util.Scanner;
public class ParameterisedFunctions {

    //Parameter is a variable passed to a function to do a certain task and are passed inside the bracket of a FUNCTION

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter num 1:");
        int a = input.nextInt();
        System.out.println("Enter num 2:");
        int b = input.nextInt();

        //Constructor Passing
        Constructor c1 = new Constructor(a, b);
        System.out.println("Sum of class constructor is : "+ c1.add());


        //System.out.println("The sum of a and b is:" +testAdd(a,b));
        //System.out.println("Value of A divided by B is:" +testDiv(a,b));


    }

    //Write a function

    public static int testAdd(int a, int b){

        int sum = a + b;

        return sum;

    }

    //Another Function
    public static int testDiv(int a, int b){

        int division = a / b;
        return division;

    }
}
