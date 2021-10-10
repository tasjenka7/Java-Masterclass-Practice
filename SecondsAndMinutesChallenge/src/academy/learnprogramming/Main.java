package academy.learnprogramming;

public class Main {
    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        System.out.println(getDurationString(15,23));
        System.out.println(getDurationString(-1,23));
        System.out.println(getDurationString(75, 3));
        System.out.println(getDurationString(3,3));
        System.out.println(getDurationString(3600));
        System.out.println(getDurationString(76));
    }

    // Another option -> to use hour string, minutes string, seconds string

    //it can be private
    public static String getDurationString(int minutes, int seconds){
        if(minutes < 0 || seconds < 0 || seconds > 59){
            // return "Invalid value";
            return INVALID_VALUE_MESSAGE;
        }
        int hours = 0;
        if(minutes >= 60){
            hours = minutes / 60;
            minutes = minutes % 60;
        }
        String duration = "";
        if(hours < 10){
            duration += "0" + hours + "h ";
        }else{
            duration += hours + "h ";
        }
        if(minutes < 10){
            duration += "0" + minutes + "m ";
        }else{
            duration += minutes + "m ";
        }
        if(seconds < 10){
            duration += "0" + seconds + "s";
        }else{
            duration += seconds + "s";
        }
        return duration;
    }

    // it can be private
    public static String getDurationString(int seconds){
        if(seconds < 0){
            //return "Invalid value";
            return INVALID_VALUE_MESSAGE;
        }
        System.out.println(seconds + " seconds");
        int minutes = seconds / 60;
        seconds %= 60;
        return getDurationString(minutes, seconds);
    }
}
