package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int[] myIntArray = new int[10];
        myIntArray[5] = 50;
        double[] myDoubleArray = new double[10];

        System.out.println(myIntArray[5]);
        System.out.println(myIntArray[6]);

        // myIntArray = {1,2,3,4,5,6,7,8,9,10};
        // we can only do this is we put it while declaring:
        // int[] myIntArray = {1,2,3,4,5,6,7,8,9,10};

        int[] myIntArray2 = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(myIntArray2[6]);

        //For loop for initializing
        for(int i=0; i<myIntArray.length; i++){
            myIntArray[i] = i * 10;
        }

        printArray(myIntArray);

    }

    public static void printArray(int[] array){
        for (int i=0; i<array.length; i++){
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }

}
