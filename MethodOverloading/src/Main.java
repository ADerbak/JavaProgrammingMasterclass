public class Main {
    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(72);
    }
    public static double calcFeetAndInchesToCentimeters(int feet, int inches) {
        if (feet >= 0 && inches >= 0 && inches <= 12) {
            System.out.println(feet + " feet and " + inches +" inches = " +
                    ((feet * 12 * 2.54) + (inches * 2.54)) + " centimeters");
            return (feet * 12 * 2.54) + (inches * 2.54);
        } else {
            System.out.println("Invalid feet or inches");
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
