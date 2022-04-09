import java.math.BigDecimal;
import java.math.RoundingMode;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        num1 = BigDecimal.valueOf(num1).setScale(3, RoundingMode.DOWN).doubleValue();
        num2 = BigDecimal.valueOf(num2).setScale(3, RoundingMode.DOWN).doubleValue();
        if (num1 == num2) {
            return true;
        } else {
            return false;
        }
    }
}
