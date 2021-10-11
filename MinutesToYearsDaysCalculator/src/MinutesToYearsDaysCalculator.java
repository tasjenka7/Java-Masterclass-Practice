public class MinutesToYearsDaysCalculator {

    public static final String INVALID = "Invalid Value";

    public static void printYearsAndDays(long minutes){
        if(minutes < 0){
            System.out.println(INVALID);
        }else {

            long years = minutes / (365 * 24 * 60);
            long remainingMinutes = minutes % (365 * 24 * 60);
            long days = remainingMinutes / (24 * 60);

            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }

}
