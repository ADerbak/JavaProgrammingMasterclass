public class SharedDigit {

    public static boolean hasSharedDigit(int num1, int num2){

        if ( num1 <10 || num1 > 99 || num2 <10 || num2 > 99)
            return false;

        int num1_placeholder = 0;
        int num2_placeholder = 0;


        while (num1 > 0){
            num1_placeholder = num1 % 10;
            int number2 = num2;
            while (number2 > 0 ){
                num2_placeholder = number2 % 10;
                if (num2_placeholder == num1_placeholder) {
                    return true;
                }
                number2 /= 10;
            }
            num1 /= 10;

        }

        return false;
    }
}
