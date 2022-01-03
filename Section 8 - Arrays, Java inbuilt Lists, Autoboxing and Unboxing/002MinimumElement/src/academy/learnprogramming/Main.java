package academy.learnprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the count value: \r");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] arr = readIntegers(count);
        int[] intArray = Arrays.copyOf(arr, count); //could have done without this

        System.out.println("Array you entered: \n");
        System.out.println(Arrays.toString(intArray));

        int min = findMin(intArray);
        System.out.println("The minimum element of the array " + Arrays.toString(intArray) + " is " + min);
    }

    public static int[] readIntegers(int count){

        int[] array = new int[count];
        System.out.println("Enter " + count + " int values:\r");
        for(int i = 0; i < count; i++){
            array[i] = scanner.nextInt();
            scanner.nextLine(); // to escape if anything else is entered in between
        }

        return array;

    }

    public static int findMin(int[] array){

        int min = array[0]; // int min = Integer.MAX_VALUE; and for from 0

        for(int i=1; i < array.length; i++){
            int value = array[i];
            if (value < min){
                min = value;
            }
        }
        return min;
    }
}
