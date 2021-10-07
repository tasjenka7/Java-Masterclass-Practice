package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1; // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5; // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3; // the remainder of (4 % 3) = 1 --> modulus
        System.out.println("4 % 3 = " + result);

        // result = result + 1
        result++; // 1 + 1 = 2
        System.out.println("1 + 1 = " +  result);
        result--; // 2 - 1 = 1
        result += 2; // 1 + 2 = 3
        result *= 10; // 3 * 10 = 30
        result /= 3; // 30 / 3 = 10
        System.out.println("30 / 3 =" + result);
        result -= 2; // 10 - 2 = 8

        /* if-then-else */
        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        /* Logical and operator  */
        int topScore = 80;
        if (topScore == 100){       // !=, >, <, >=, <=
            System.out.println("You got the high score!");
        }

        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100){
            System.out.println("Grater than second top score and less than 100");
        }

        // Easier to read code
        if ((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("Grater than second top score and less than 100");
        }
        /* Logical or operator */
        if ((topScore > 90) || (topScore <= 90)){
            System.out.println("Either or both conditions are true.");
        }

        /* Assignment operator VS Equals to operator */
        int newValue = 50;
        if (newValue == 50){    // newValue = 50 -> error
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (isCar = true){ //-> greskaa
            System.out.println("This is not supposed to happen. ");
        }

        // simplified, and prevents unintentional asignment
        if(isCar){
            System.out.println("It is a car");
        }

        if(!isCar){
            System.out.println("It is not a car");
        }

        // Ternary Operator -> if condition is true the first happends, else second
        //                   -> good to use parentisses when complex condition
        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar){
            System.out.println("wasCar is true");
        }

        // Operator Precedence and Operator challenge
        // Challenge:
        double variable = 20.00d;
        double variable2 = 80.00d;
        double res = (variable + variable2) * 100.00d;
        System.out.println("Result for now: " + res);
        double remainder = res % 40.00d;
        System.out.println("The reaminder is " + remainder);
        boolean isZero = (remainder == 0) ? true : false;
        System.out.println("isZero = " + isZero);
        if (!isZero){
            System.out.println("Got some remainder.");
        }



    }
}
