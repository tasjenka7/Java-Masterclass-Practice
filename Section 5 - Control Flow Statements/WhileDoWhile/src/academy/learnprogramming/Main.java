package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int count = 0;
        while(count != 5){
            System.out.println("Count value is " + count);
            count++;
        }

        System.out.println("##############");

        count = 1;
        while(true){
            if(count == 5){
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }


        System.out.println("##############");

        count = 1;
        do{
            System.out.println("Count value was " + count);
            count++;
        }while(count != 6);

        //infinite loop
        /*
        count = 6;
        do{
            System.out.println("Count value was " + count);
            count++;
        }while(count != 6);
        */

        //Challenge

        /*
        * Create a method called isEvenNumber that takes a parameter of type int
        * Its purpose is to determine if the argument passed to the method is
        * an even number or not
        * return true if an even number, otherwise return false;
        * */

        int number = 4;
        int finishNumber = 20;
        while(number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            System.out.println("Even number " + number);
        }

        /*
        * Modify the while code above
        * Make it also record the total number od even numbers it has found
        * and break once 5 are found
        * and at the end, display the total number of even numbers found
        * */

        number = 4;
        finishNumber = 20;
        int numberOfEven = 0;
        while(number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            numberOfEven++;
            System.out.println("Even number " + number);
            if(numberOfEven >= 5){
                break;
            }
        }
        System.out.println("Total number of even found: " + numberOfEven);


    }

    public static boolean isEvenNumber(int number){
        if((number % 2) == 0){
            return true;
        }else{
            return false;
        }
    }


}
