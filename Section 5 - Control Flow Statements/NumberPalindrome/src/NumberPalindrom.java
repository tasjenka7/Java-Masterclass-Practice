public class NumberPalindrom {

    public static boolean isPalindrome(int number){

        int lastDigit = 0;
        int numberCopy = number;
        int reverse = 0;
        while(number != 0){
            lastDigit = number % 10;
            number /= 10;
            reverse = reverse*10 + lastDigit;
        }
      //  System.out.println("Number: " + numberCopy + "\nReversed " + reverse);
        if(reverse == numberCopy || reverse == (-1)*numberCopy){
            return true;
        }else{
            return false;
        }

    }

}
