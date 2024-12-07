package org.example.basics;

public class Conditions {
    public static void main(String[] args) {
        int time = 22;
        if (time < 10) {  //if 10 is greater than time this will execute
            System.out.println("Good morning.");
        } else if (time < 18) { //if 18 is greater than time this will execute
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening."); //none of the above is correct this will execute
        }
        //Ternery operator
        int timeTernary = 20;
        String result = (timeTernary < 18) ? "Good day." : "Good evening.";
        System.out.println(result);
        //switch case
        int day = 40;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("default");
        }
    }
}