public class Main {

    public static void main(String[] args) {

        System.out.println("Digit count");
        System.out.println(NumberToWords.getDigitCount(0));
        System.out.println(NumberToWords.getDigitCount(123));
        System.out.println(NumberToWords.getDigitCount(-12));
        System.out.println(NumberToWords.getDigitCount(5200));
        System.out.println("--------------------");

        System.out.println("Reverse");
        System.out.println(NumberToWords.reverse(-121));
        System.out.println(NumberToWords.reverse(1212));
        System.out.println(NumberToWords.reverse(1234));
        System.out.println(NumberToWords.reverse(100));
        System.out.println("----------------------");

        System.out.println("Number to words");
        NumberToWords.numberToWords(123);
        NumberToWords.numberToWords(1010);
        NumberToWords.numberToWords(1000);
        NumberToWords.numberToWords(-12);

        System.out.println("Check 0");
        System.out.println(NumberToWords.reverse(0));
        NumberToWords.numberToWords(0);
    }

}
