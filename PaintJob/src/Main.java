public class Main {

    public static void main(String[] args) {

        int x = PaintJob.getBucketCount(2.75, 3.25, 2.5, 1);
        System.out.println(x);

        int y = PaintJob.getBucketCount(3.26,0.75);
        System.out.println(y);
    }
}
