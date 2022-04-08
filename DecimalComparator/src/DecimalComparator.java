public class DecimalComparator {
    public static boolean areEqualByThreeDecimalsPlaces{double num1, double num2){
        num1 = (double)Math.round(num1 * 1000d) / 1000d;
        num2 = (double)Math.round(num2 * 1000d) / 1000d;
        if (num1 == num2) {
            return true;
        } else {
            return false;
        }
    }
}
