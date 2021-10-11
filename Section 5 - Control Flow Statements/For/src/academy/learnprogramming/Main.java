package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
        System.out.println("10,000 at 3% interest = " + calculateInterest(10000.0, 3.0));
        System.out.println("10,000 at 4% interest = " + calculateInterest(10000.0, 4.0));
        System.out.println("10,000 at 5% interest = " + calculateInterest(10000.0, 5.0));

        for(int i=0; i<5; i++){
            System.out.println("Loop " + i + " hello!");
        }

        System.out.println("#################");

        // Using the for statement call the calculateInterest method with
        // the amount of 10000 with an interestRate od 2, 3, 4, 5, 6, 7 and 8
        // and print the result to the console window

        for(int i=2; i<9; i++){
            System.out.println("10,000 at " + i + "% rate interest = " + String.format("%.2f",calculateInterest(10000.0, i)));
        }

        System.out.println("###################");

        // How would you modify the for loop above to do the same thing as
        // shown but to start from 8% and work back to 2%
        for(int i=8; i>1; i--){
            System.out.println("10,000 at " + i + "% rate interest = " + String.format("%.2f",calculateInterest(10000.0, i)));
        }

        System.out.println("#######");
        primesInRange(1, 13);
        System.out.println("********");
        primesInRange(7,21);

    }

    // Create a for statement using any range of numbers
    // Determing if the number is a prime number using the isPrime method
    // if it is a prime number, print it out AND increment a count of the
    // number of prime numbers found
    // if that count is 3 exit the for loop
    // hint: Use the break; statement to exit

    private static void primesInRange(int start, int end){

        int numberOfPrimes = 0;

        for(int i = start; i <= end; i++){
            if(numberOfPrimes == 3){
                break;
            }
            if(isPrime(i)){
                System.out.println(i);
                numberOfPrimes++;
            }

        }
    }
    /*
    int count = 0;
    for(int i=10; i<50; i++){
        if(isPrime(i)){
            count++;
            System.out.println(i);
            if(count == 3){
                System.out.println("Exiting for loop");
                break;
            }
       }
    }

    * */


    public static boolean isPrime(int n){
        if(n == 1) {
            return false;
        }

        for(int i=2; i <= (long) Math.sqrt(n); i++){
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static double calculateInterest(double amount, double interestRate){
        return (amount*(interestRate / 100));
    }
}
