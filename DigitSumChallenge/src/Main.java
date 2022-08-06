public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(155125));
    }

    public static int sumDigits(int number){
        int total = 0;

        if (number < 10){
            return -1;
        } else {
            while(number > 0) {
                total += number % 10;
                number /= 10;
                }
            }
        return total;
    }
}
