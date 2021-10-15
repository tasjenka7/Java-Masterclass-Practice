public class LargestPrime {

    public static int getLargestPrime(int number){

        if(number < 2){
            return -1;
        }

        int largestPrime = -1;
        int var;
        boolean notPrime = false;
        for(int i = 2; i <= number; i++){
            if(number % i == 0){
                var = i;
                for(int j = 2; j< var; j++){
                    if(var % j == 0){
                        notPrime = true;
                    }
                }
                if(!notPrime){
                    largestPrime = i;
                }

            }
        }
        return  largestPrime;
    }

}
