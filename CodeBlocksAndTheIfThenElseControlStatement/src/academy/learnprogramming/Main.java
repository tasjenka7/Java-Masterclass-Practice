package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        // if there is just one line we can do without {}
        if(score == 5000)
            System.out.println("Your score was 5000");

        System.out.println("This is executed always");
        // ALWAYS use code block
        score = 4000;

        /*if (score < 5000 && score > 1000){
            System.out.println("Your score was less than 5000 but grater than 1000");
        } else if (score < 1000){
            System.out.println("Your score was less then 5000");
        }
        else {
            System.out.println("Got here ");
        }*/

        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        // WE CAN'T DO THIS:
        // int savedFinalScore = finalScore;

        /*
        Print out a second score on the screen with the following
        score set to a 10000
        levelCompleted set to 8
        bonus set to 200
        But make sure the first printout above still displays as well
        */
        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Second final score was " + finalScore);
        }
        // Disadvantages: copying code and losing info about previous values,
        // duplicating code -> we can forget to change code in all places.

    }
}
