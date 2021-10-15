package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        String numberAsString = "2018";
        System.out.println("numberAsString = " + numberAsString);

        int number = Integer.parseInt(numberAsString);
        System.out.println("number = "+ number);

        numberAsString += 1;
        number += 1;

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);

        System.out.println("What if we have accidently a letter inside number string?");
        numberAsString = "2018a";
        //number = Integer.parseInt(numberAsString);
        System.out.println("We get an exception.");
        // For now we just remove te letter


        System.out.println("Other datatypes: ");
        numberAsString = "2018";
        double numberDouble = Double.parseDouble(numberAsString);
        System.out.println("numberDouble = " + numberDouble);
        String anotherNumberAsString = "2018.125";
        double anotherNumberDouble = Double.parseDouble(anotherNumberAsString);
        System.out.println(anotherNumberDouble);
        // Concatenation and adding 1 works as expected




    }
}
