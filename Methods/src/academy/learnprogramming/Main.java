package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        // We can define variables and then assign them values and use them in
        // method calls, that makes code cleaner - easier to read

        int levelCompleted = 5;

        int highScore = calculateScore(true, 800, levelCompleted, 100);
        System.out.println("Your final score was " + highScore);
        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score whas " + highScore);

        /*
        Version 1 call

        calculateScore(true, 800, levelCompleted, 100);
        calculateScore(true, 10000, 8, 200);
        */

        // Challenge:
        /*
        Create a method called displayHighScorePosition
        it should a players name as a parameter, and a 2nd parameter as a position in the high score table
        You should display the players name along with a message like "managed to get into position" and the
        position they got and a further message "on the high score table".

        Create a 2nd method called calculateHighScorePosition
        it should be sent one argument only, the player score
        it should return an int
        the return should be
        1 if the score is >=1000
        2 if the score is >=500 and < 1000
        3 it the score is >= 100 and < 500
        4 in all other cases
        call both methods and display the results of the following
        a score of 1500, 900, 400 and 50

        */
        int position = calculateHighScorePosition(1500);
        displayHighScorePosisition("Petar", position);

        position = calculateHighScorePosition(900);
        displayHighScorePosisition("Tamara", position);

        position = calculateHighScorePosition(400);
        displayHighScorePosisition("Jelena", position);

        displayHighScorePosisition("AAA", calculateHighScorePosition(50));

        position = calculateHighScorePosition(1000);
        displayHighScorePosisition("Louise", position);
    }

    // We can't put method inside another method.
    // Version 2
    public static int calculateScore(boolean gameOver, int score, int levelCompleted,  int bonus){

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }

        return -1;


    }

    // void - don't return anyhting
    // Version 1:
    /*public static void calculateScore(boolean gameOver, int score, int levelCompleted,  int bonus){

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }

    }*/

    // Challenge methods
    public static void displayHighScorePosisition(String playerName, int highScorePosition){
        System.out.println(playerName + " managed to get into position " +
                highScorePosition + " on the high score table.");
    }

    public static int calculateHighScorePosition(int playerScore){
        if(playerScore >= 1000){
            return 1;
        }else if(playerScore >= 500){
            return 2;
        }else if(playerScore >= 100){
            return 3;
        }
        return 4;
    }

    // Modification to eliminate multiple return statements
    public static int calculateHighScorePositionModified(int playerScore){
        int position = 4; // assuming position 4 will be returned
        if(playerScore >= 1000){
            position = 1;
        }else if(playerScore >= 500){
            position = 2;
        }else if(playerScore >= 100){
            position =  3;
        }
        return position;
    }
}
