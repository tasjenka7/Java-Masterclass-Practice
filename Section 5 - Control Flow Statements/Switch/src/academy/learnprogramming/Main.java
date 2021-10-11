package academy.learnprogramming;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

       /* int value = 1;
        if(value == 1){
            System.out.println("Value was 1");
        }else if(value == 2){
            System.out.println("Value was 2");
        }else {
            System.out.println("Was not 1 or 2");
        }*/

        int switchValue = 1;
        switch (switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1, 2, 3, 4 or 5");
                break;
        }

        // Challenge
/*
        Create a new switch statement using char instead of int
        create a new char variable
        create a switch statement testing for
        A, B, C, D or E
        display a message if any of these are found and then break
        Add a default which displays a message saying not found
*/
        char testValue = 'G';
        switch(testValue){
            case 'A' :
                System.out.println("Found A");
                break;
            case 'B':
                System.out.println("Found B");
                break;
            case 'C':
                System.out.println("Found C");
                break;
            case 'D':
                System.out.println("Found D");
                break;
            case 'E':
                System.out.println("Found E");
                break;
            default:
                System.out.println("Not found A, B, C, D or E");
                break;
        }

        String month = "JANuary";
        switch (month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
                break;
        }

        printDayOfTheWeek(3);
        printDayOfTheWeek(-1);
        printDayOfTheWeek(7);
        printDayOfTheWeek(1);

    }

    private static void printDayOfTheWeek(int day){
        switch (day){
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
                System.out.println("Invalid day");
                break;
        }
    }

}
