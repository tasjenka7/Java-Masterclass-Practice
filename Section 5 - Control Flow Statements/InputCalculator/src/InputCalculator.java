import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage(){

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        long average = 0;
        int counter = 0;
        int number;

        while(true){

            if(scanner.hasNextInt()){

                number = scanner.nextInt();
                counter++;

                sum += number;
             double temp = (double)sum/(double)counter;
                average = Math.round(temp);
            }else{
                break;
            }

        }

        System.out.println("SUM = " + sum + " AVG = " + average);

        scanner.close();
    }

}
