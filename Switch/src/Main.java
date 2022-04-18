public class Main {
    public static void main(String[] args) {

//        int value = 2;
//        if(value == 1){
//            System.out.println("Value was 1");
//        } else if (value==2){
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Value was not 1 or 2");
//        }

        int switchValue = 3;

        switch (switchValue){ // only tests for the value
            case 1:
                System.out.println("Value was 1");
                break;  // break is put in to jump out of switch
            // if no break is specified, the output will continue to the next case's output.

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5: //tests for multiple cases with one output
                System.out.println("Value was a 3, 4, or 5");
                System.out.println("Actually it was a " + switchValue);
                break;

            default:
                System.out.println("Value was not 1 or 2");
                break; // This isn't necessary for the code, but it is good for readability
        }

        // Break comes to here
    }
}
