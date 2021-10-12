package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println("125 = " + sumDigits(125));
        System.out.println("-125 = " + sumDigits(-125));
        System.out.println("5 = " + sumDigits(5));
        System.out.println("-5 = " + sumDigits(-5));
        System.out.println("1234 = " + sumDigits(1234));
    }

    private static int sumDigits(int number){
        if(number < 10){
            return -1;
        }
        int sum = 0;
        while(number > 0){
            sum = sum + number % 10;
            number /= 10;
        }
        return sum;
    }

}
