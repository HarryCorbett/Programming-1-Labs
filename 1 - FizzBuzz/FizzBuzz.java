import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {

        System.out.println("Enter number to go to:");
        Scanner myScanner = new Scanner(System.in);
        String num = myScanner.nextLine();

        for(int i = 1; i < Integer.parseInt(num) + 1; i++){ //start loop from 1 to inputted number

            String output = "";

            //If i is a multiple of 3
            if(i % 3 == 0){
                output += "Fizz";
            }

            //If i is a multiple of 5
            if(i % 5 == 0){
                output += "Buzz";
            }

            // If it is neither a multiple of 3 or 5
            if(output.equals("")){
                output = Integer.toString(i);
            }

            System.out.println(output);

        }

    }

}