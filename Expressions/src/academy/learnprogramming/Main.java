package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
       /* Expressions are building blocks of all Java programms, built
        with variables, values and operators, also with method calls */

        // a mile is equal to 1.609344km
        double kilometers = (100 * 1.609344); // expression: kilometers = (100 * 1.609344)
        //      |_ variable      |_ op     |_values (expression)
        // By adding a valid Java type we create a valid Java statement and a semicolon

        int highScore = 50; // expression: highScore = 50
        if(highScore == 50){
            System.out.println("This is an expression"); //expression: "This is an expression"
        }

        // In the following code that I will type below, write down what parts of
        // the code are expressions.
        /*
        int score = 100;
        if(score > 99){
            System.out.println("You got the high score!");
            score = 0;
        }

        Expressions:
            score = 100
            score > 99
            "You got the high score!"
            score = 0
        * */

    }
}
