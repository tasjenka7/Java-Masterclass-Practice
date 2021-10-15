public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }

        int bigBag = 5;
        int smallBag = 1;

        if((bigCount*bigBag + smallCount*smallBag) < goal){
            return false;
        }

        if((bigCount*bigBag + smallCount*smallBag) == goal){
            return true;
        }

        for(int i = 0; i <= bigCount; i++){
            for(int j = 0; j<= smallCount; j++){

                if(i*bigBag + j*smallBag == goal){
                    return true;
                }

            }
        }
        return false;
    }

}
