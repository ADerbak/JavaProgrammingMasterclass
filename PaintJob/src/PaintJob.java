public class PaintJob {

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if(width*height*areaPerBucket <= 0 || extraBuckets <0){
            return -1;
        }

        double totalArea = width*height;
        //System.out.println(totalArea);

        double sumBucketsNeeded = (totalArea/areaPerBucket);
        //System.out.println(sumBucketsNeeded);

        return (int)(Math.ceil(sumBucketsNeeded-extraBuckets));

    }


    public static int getBucketCount(double width, double height, double areaPerBucket){
        return getBucketCount(width, height, areaPerBucket, 0);
    }

    public static int getBucketCount(double area, double areaPerBucket){
        if (area*areaPerBucket <= 0) return -1;
        return (int)(Math.ceil(area/areaPerBucket));
    }
}
