public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temperature){
        int upperTemperature = 35;
        if(summer){
            upperTemperature = 45;
        }
        if(temperature >= 25 && temperature <= upperTemperature){
            return true;
        }
        return false;
    }

}
