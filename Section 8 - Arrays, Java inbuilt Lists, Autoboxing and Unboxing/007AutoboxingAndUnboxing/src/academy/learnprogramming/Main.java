package academy.learnprogramming;

import java.util.ArrayList;

class IntClass{
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {

    public static void main(String[] args) {

        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Tim");

        //We can't do because int is not a class it's a primitive type
        //ArrayList<int> intArrayList = new ArrayList<int>();

        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));

        //Better way -> Autoboxing it uses wrapper
        Integer integer = new Integer(54); //int and Integer -> Integer is class
        Double doubleVal = new Double(12.25);

        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();

        //Autoboxing
        for(int i=0; i<=10; i++){
            integerArrayList.add(Integer.valueOf(i));
        }

        //Unboxing
        for(int i=0; i<=10; i++){
            System.out.println(i + " --> " + integerArrayList.get(i).intValue());
        }

        Integer myIntValue = 56; //At compile time Integer.valueOf(56)
        int myInt = myIntValue; // myInt.intValue();

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for(double dbl=0.0; dbl<= 10.0; dbl += 0.5){
            myDoubleValues.add(Double.valueOf(dbl)); // or .add(dbl)
        }

        for(int i=0; i<myDoubleValues.size(); i++){
            double value = myDoubleValues.get(i).doubleValue(); //or .get(i)
            System.out.println(i + "-->" + value);
        }


    }

}
