package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        float myMinFLoatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFLoatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        /*int myIntValue = 5;
        float myFloatValue = 5; //5 or 5f its optional, but 5.25 needs f or (float)5.25
        double myDoubleValue = 5; //5 or 5d, double is prefered
        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);
*/
       /* int myIntValue = 5 / 2;
        float myFloatValue = 5f / 2; //5 or 5f its optional, but 5.25 needs f or (float)5.25
        double myDoubleValue = 5d / 2 ; //5 or 5d, double is prefered
        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);
*/
        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f; //5 or 5f its optional, but 5.25 needs f or (float)5.25
        double myDoubleValue = 5d / 3d ; //5.00/3.00
        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);

        /* Challenge: Pounds to kilograms */
        double numberOfPounds = 200d;
        double convertedKilograms = numberOfPounds * 0.45359237d;
        System.out.println(numberOfPounds + " pounds = " + convertedKilograms + " kilograms ");

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);
    }
}
