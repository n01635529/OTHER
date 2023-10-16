import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {

        // input / setting variables

        Scanner sc = new Scanner(System.in);
        System.out.print("Input your number: ");
        int number = sc.nextInt();
        sc.close();
        int factorial = 1;

        // calculates the factorial for the number

        for (int i = 1; i <= number; i++) {
                factorial = factorial * i;
        }

        // prints the factorial and number inputted
        
        System.out.println("The factorial for " + number + " is " + factorial);

    }

}