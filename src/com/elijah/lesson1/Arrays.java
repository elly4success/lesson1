package com.elijah.lesson1;

public class Arrays {

    public static void main(String[] args){
        //Array is a collection of data of same data type under the same name
        //Syntax: declare data type followed by [] and then variable name

        int [] everyOnes_age = {1,2,3,4,5,6};
        String [] everyOnes_name ={"Levis", "Elly", "Roy", "Eve" ,"Tab"};
        float [] bankAccount={800.55f, 123.02f, 34456,01f, 0987.2f};
        boolean [] values={false, true};
        char []myName= {'E', 'L', 'I', 'J', 'A', 'H'};

        //System.out.println(myName);
       // System.out.println(bankAccount);

        //Syntax of a FOR loop== for(condition) and (statement)
        //Condition has three parts:
        /*
        1. Starting point
        2. Ending point
        3. Condition
         */

        for (int i = 0; i < myName.length; i++){
            System.out.println(myName[i]);

        }

        System.out.println("Print after my name\nEvery One's name in the class:\n");

        for (int i = 0; i < everyOnes_name.length; i++) {
            System.out.println(everyOnes_name[i]);


        }
    }
}
