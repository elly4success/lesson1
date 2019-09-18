package com.elijah.lesson1;

public class ControlStructure {

    //Control Structures
    // Statements are used to control the flow of execution of a certain program
    /*
    Types of loops:
    1. If
    2. else if
    2. else
    3. do
    4. while
    5. for
    6. switch
     */
    public static void main(String[]args){
        //examples

        int a = 5;
        int b = 5;
        //using if statement
        //if (condition) (statement(s))
        if (a == 5){
            System.out.println("Yeah !. Our A is:" + a +  ". " + "TRUE");
            //checking second statement
        }else if( b== 5){
            System.out.println("TRUE");
        }else{
            System.out.println("Hmm !. Our A is not equal to: "+ a + ""+ "FALSE");
        }


    }
}
