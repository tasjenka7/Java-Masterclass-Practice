public class LastDigitChecker {

    public static boolean hasSameLastDigit(int num1, int num2, int num3){
        if(isValid(num1) && isValid(num2) && isValid(num3)){
            num1 = num1 % 10;
            num2 = num2 % 10;
            num3 = num3 % 10;

            if(num1 == num2 || num1 == num3 || num2 == num3){
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean isValid(int number){
        if(number >= 10 && number <= 1000){
            return true;
        }
        return false;
    }

}
