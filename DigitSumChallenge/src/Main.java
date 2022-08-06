public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(125));
    }

    public static int sumDigits(int number){
        int total = 0;

        if (number < 10){
            return -1;
        } else {
            while(number != 0) {
                int value = 0;
                for (int i = 1000; i >= 1; i /= 10) {
                    value = number / i;
                    total += value;
                    number -= value * i;


                }
            }

        }
        return total;
    }
}
