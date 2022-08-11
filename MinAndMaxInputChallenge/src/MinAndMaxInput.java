import java.util.Scanner;

public class MinAndMaxInput {

    public static void getMinAndMax() {

        Scanner scanner = new Scanner(System.in);

        int min = 0, max = 0;

        while (true) {


            System.out.println("Enter a number: ");

            boolean valid = scanner.hasNextInt();
            if (valid) {
                int num = scanner.nextInt();
                scanner.nextLine();
                if (min == 0 || num < min)
                    min = num;
                if (num > max)
                    max = num;
            }else{
                    System.out.println("Invalid Value");
                    break;
                }


            }

        System.out.println("Min: "+ min);
        System.out.println("Max: "+ max);
        scanner.close();
    }
}
