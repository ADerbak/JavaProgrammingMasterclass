import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage(){

        Scanner scanner = new Scanner(System.in);

        int sum = 0, count = 0;

        while(true){

            boolean isInt = scanner.hasNextInt();
            if(isInt){
                int num = scanner.nextInt();
                sum+=num;
                count++;
            } else {
                break;
            }
        }

        long avg = count == 0?0: (long) Math.round((double) sum / count);

        System.out.println("SUM = "+ sum+ " AVG = "+avg);
    }

}
