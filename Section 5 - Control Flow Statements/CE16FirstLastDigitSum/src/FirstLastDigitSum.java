public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number){

        if(number < 0){
            return -1;
        }

        if(number < 10){
            return 2*number;
        }

        int lastDigit = number % 10;
        while(number >= 10){
            number /= 10;
        }
        int firstDigit = number;
        return lastDigit + firstDigit;
    }

}
