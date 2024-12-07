package org.example.basics;

public class Loops {
    public static void main(String[] args) {
        //while loop
        int countdown = 3;

        while (countdown > 0) {   //Loops can execute a block of code as long as a specified condition is reached.
            System.out.println(countdown);
            countdown--; //do not forget to increment or decrement, otherwise the loop will never end!
        }

        System.out.println("Happy New Year!!");


        //do while loop
        // When you know exactly how many times you want to loop through a block of code, use the for loop instead of a while loop:
        int i = 0;
        do {  //The loop will always be executed at least once
            System.out.println(i);
            i++;
        }
        while (i < 5);

//for loop

        int number = 2;

        // Print the multiplication table for the number 2
        for (int j = 1; j <= 10; j++) {
            /*
            Statement 1 is executed (one time) before the execution of the code block.

            Statement 2 defines the condition for executing the code block.

            Statement 3 is executed (every time) after the code block has been executed.
             */
            System.out.println(number + " x " + j + " = " + (number * j));
        }
        //break
        for (int k = 0; k < 10; k++) {
            if (k == 4) {
                break; //break statement can also be used to jump out of a loop
            }
            System.out.println(k); //This example stops the loop when k is equal to 4:
        }
        //continue
        for (int l = 0; l < 10; l++) {
            if (l == 4) {
                continue; //This example skips the value of 4:
            }
            System.out.println(l);
        }
    }
}