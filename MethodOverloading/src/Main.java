public class Main {
    public static void main(String[] args) {

        double result = calcFeetAndInchesToCentimeters(72);
        System.out.println(result);
    }
    public static double calcFeetAndInchesToCentimeters(int feet, int inches) {
        if (feet >= 0 && inches >= 0 && inches <= 12) {
            return (feet * 12 * 2.54) + (inches * 2.54);
        } else {
            return -1;
        }
    }
    public static double calcFeetAndInchesToCentimeters(int inches) {
        if ( inches >= 0) {
            return calcFeetAndInchesToCentimeters(inches/12, inches % 12);
        } else {
            return -1;
        }
    }
}
