import java.util.Scanner;

// One solution is to use flag to insure to use entered numbers
// Second one is to set min to max val int can hold, and same for max
// min = 2147483647
// max = -2147483648

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 0;
        boolean first = true;

        int currentNumber;

        while(true){

            System.out.println("Enter number: ");

            if(scanner.hasNextInt()){

                currentNumber = scanner.nextInt();

                if(first){
                    first = false;
                    min = currentNumber;
                    max = currentNumber;
                }

                if(currentNumber < min){
                    min = currentNumber;
                }

                if(currentNumber > max){
                    max = currentNumber;
                }
            }else{
                break;
            }
            scanner.nextLine(); //handle input
        }

        if(first){
            System.out.println("No number entered!");
        }else{
            System.out.println("Max: " + max + "\nMin: " + min);
        }

        scanner.close();
    }

}
