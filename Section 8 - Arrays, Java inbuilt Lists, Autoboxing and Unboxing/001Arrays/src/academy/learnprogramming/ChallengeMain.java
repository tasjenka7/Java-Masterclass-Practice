package academy.learnprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class ChallengeMain {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] testArray = getIntegers(7);
        printArray(testArray);

        System.out.println("Sorted descending:");

        int[] sorted = sortIntegers(testArray);
        printArray(sorted);
    }

    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values:\r");

        int[] arr = new int[number];
        for(int i=0; i<number; i++){
            arr[i] = scanner.nextInt();
        }
        return arr;

    }

    public static void printArray(int[] array){

        for(int i=0; i<array.length; i++){
            System.out.println("Element on position " + i + " has an input value " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array){

        int[] sortedArray = new int[array.length];


        for(int i=0; i<array.length; i++){
            int countHigher = 0;

            for(int j=0; j<array.length; j++){

                if(array[j] > array[i]){
                    countHigher++;
                }
            }
            sortedArray[countHigher] = array[i];
        }

        return sortedArray;
    }

    public static int[] sortIntegers2(int[] array){
//        int[] sortedArray = new int[array.length];
//        for(int i=0; i<array.length; i++){
//            sortedArray[i] = array[i];
//        }
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for(int i=0; i<sortedArray.length-1; i++){
                if(sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
