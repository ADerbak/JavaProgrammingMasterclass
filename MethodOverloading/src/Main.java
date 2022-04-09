public class Main {
    public static void main(String[] args) {

        double result = calcFeetAndInchesToCentimeters(5, 9);
        System.out.println(result);


    }

    public static double calcFeetAndInchesToCentimeters(int feet, int inches) {
        if (feet >= 0 && inches >= 0 && inches <= 12) {
            double centimeters = (feet * 12 * 2.54) + (inches * 2.54);
            return centimeters;
        } else {
            return -1;
        }
    }
}
