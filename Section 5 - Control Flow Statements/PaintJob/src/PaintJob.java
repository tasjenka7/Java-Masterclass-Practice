public class PaintJob {

    public static int getBucketCount(double width, double height,
                                     double areaPerBucket,int extraBuckets){

        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        }

        double areaToPaint = width * height;
        int bucketsNeededToPaint = (int)Math.ceil(areaToPaint / areaPerBucket);

        if(extraBuckets > bucketsNeededToPaint){
            return 0;
        }else {
            return bucketsNeededToPaint - extraBuckets;
        }
    }

    public static int getBucketCount(double width, double height,
                                     double areaPerBucket){

        if(width <= 0 || height <= 0 || areaPerBucket <= 0){
            return -1;
        }

        double areaToPaint = width * height;
        int bucketsNeededToPaint = (int)Math.ceil(areaToPaint / areaPerBucket);

        return bucketsNeededToPaint;
    }

    public static int getBucketCount(double area, double areaPerBucket){

        if(area <= 0 || areaPerBucket <= 0){
            return -1;
        }
        int bucketsNeeded = (int)Math.ceil(area/areaPerBucket);
        return bucketsNeeded;
    }



}
