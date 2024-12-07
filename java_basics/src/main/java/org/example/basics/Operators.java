package org.example.basics;

public class Operators {
    public static void main(String[] args) {
        /* Operator           Example
          ==	                x == y
          !=                    x != y
          >                     x > y
          <                     x < y
          >=                    x >= y
          <=	                x <= y
          && 	                x < 100 &&  x > 90  //	Returns true if both statements are true
          || 	                x < 5 || x < 4   //Returns true if one of the statements is true
          !                     !(x < 5 && x < 10) //Reverse the result, returns false if the result is true
          %                      x % y //Returns the division remainder

         */
        int i = 5;

        System.out.println(i++); // Prints 5, then increments i to 6
        System.out.println(++i);  // Increments i to 7, then prints 7
    }
}