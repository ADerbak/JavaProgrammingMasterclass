public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number){
        if (number < 0)
            return -1;

        if (number < 10){
            return number+number;
        }

        int digitSum = number % 10;
        number /= 10;

        while (number > 0){
            if (number < 10){
                digitSum += number % 10;
            }
            number /= 10;
        }
        return digitSum;
    }
}
