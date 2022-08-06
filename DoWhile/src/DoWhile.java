public class DoWhile {

    public static void main(String[] args) {
        int count = 6;

        //regular while
        while (count !=6) {
            System.out.println("Count value is " + count);
            count++;
        }

        count = 6;

        // Do - while will execute once and then check the while.
        // In the above While, it never executes because count =6;
        // However, in the below case, count = 6, gets incremented by 1,
        // and then the while is checked (now count is equal to 7)
        do{
            System.out.println("Count value was " + count);
            count++;

            if(count > 100){
                break;
            }
        } while (count != 6);


        // Create a method called isEvenNumber that tkaes a parameter of type int
        // ITs purpose is to determine if the argument passed to the mehtod is an even number or not.
        // return true if an even number, otherwise return false;

        System.out.println("3 is an even number: " + isEvenNumber(3));
    }

    public static boolean isEvenNumber(int num){
        return num % 2 == 0;
    }
}
