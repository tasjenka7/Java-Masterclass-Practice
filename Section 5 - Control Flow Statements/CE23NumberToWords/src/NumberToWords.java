public class NumberToWords {

    public static int getDigitCount(int number){
        if(number < 0){
            return -1;
        }

        int digitCount = 0;
        while(number >= 10){
            number /= 10;
            digitCount++;
        }
        if(number >= 0 && number<10){
            digitCount++;
        }
        return digitCount;

    }

    public static int reverse(int number){

        int reveresedNumber = 0;
        while(number != 0){
            reveresedNumber = reveresedNumber*10 + number%10;
            number /= 10;
        }
        return reveresedNumber;
    }

    public static void numberToWords(int number){

        if(number < 0){
            System.out.println("Invalid Value");
        }

        if(number == 0){
            System.out.println("Zero");
        }

        int numberOfDigits = getDigitCount(number);
        int reveresedNumber = reverse(number);
        int numberOfDigitsReveresed = getDigitCount(reveresedNumber);
        int zeroes = numberOfDigits - numberOfDigitsReveresed;

        while (reveresedNumber > 0){

            printDigit(reveresedNumber % 10);
            reveresedNumber /= 10;

        }


        for (int i = 1; i <= zeroes; i++){
            System.out.println("Zero");
        }
    }

    private static void printDigit(int digit) {

        switch (digit){
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            default:
                System.out.println("Invalid Value");
                break;
        }

    }

}
