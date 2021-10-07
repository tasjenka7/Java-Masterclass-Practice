/*
Write a method called checkNumber with an int parameter number.
The method should not return any value, and it needs to print out:
    "positive" if number is > 0
    "negative" if number is < 0
    "zero" if number is equal to 0

NOTE: method should be public static as we did it for now
NOTE: do not add a main method to your solution code
*/

public class PositiveNegativeZero {

    public static void main(String[] args) {
        checkNumber(55);
        checkNumber(-5);
        checkNumber(0);
    }

    public static void checkNumber(int number){
        if(number > 0){
            System.out.println("positive");
        }
        else if(number < 0){
            System.out.println("negative");
        }
        else if (number == 0){
            System.out.println("zero");
        }
    }

}
