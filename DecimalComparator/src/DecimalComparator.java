public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double a, double b){
       int a1 = (int)(a*1000);
       int b1 =(int)(b*1000);
       if (a1 == b1){
           return true;
       }else{
           return false;
       }
    }
}
