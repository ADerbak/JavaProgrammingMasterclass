public class AreaCalculator {
    public static double area(double radius){
        if(radius<0){
            return -1;
        }
        double value = Math.PI * radius * radius;
        return value;
    }
    public static double area(double x, double y){
        if(x < 0 || y < 0){
            return -1;
        }
        double value = x * y;
        return value;
    }
}
