public class NumberPalindrome {

    public static boolean isPalindrome(int number){

        if (number < 0)
            number *= -1;

        int palindrome = 0;
        int starter = number;

        while (starter > 0){
            if (starter >10){
                int digit = starter % 10;
                palindrome = digit + palindrome * 10;
                System.out.println(palindrome);
                starter /=10;
            } else {
                int digit = starter % 10;
                palindrome = digit + palindrome*10;
                System.out.println(palindrome);
                starter /=10;
            }
        }

        return palindrome == number;
    }
}

