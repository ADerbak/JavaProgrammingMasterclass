public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(1125));
    }

    public static int sumDigits(int number){
        int total = 0;

        if (number < 10){
            return -1;
        } else {
            while(number != 0){
                int thousands = 0;
                thousands = number / 1000;
                total += thousands;
                number -= thousands * 1000;

                int hundreds = 0;
                hundreds = number / 100;
                total += hundreds;
                number -= hundreds * 100;

                int tens = 0;
                tens = number / 10;
                total += tens;
                number -= tens * 10;


                int ones = 0;
                ones = number / 1;
                total += ones;
                number -= ones;

            }

        }
        return total;
    }
}
