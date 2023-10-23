import java.util.Scanner;

public class practice_nichols {

    public static void main(String[] args) {

        // input / setting variables

        Scanner sc = new Scanner(System.in);
        System.out.print("Input your number: ");
        final int number = sc.nextInt();
        sc.close();
        int factorial = 1;

        // calculates the factorial for the number

        for (int i = 1; i <= number; i++) {
                factorial = factorial * i;
        }

        // prints the factorial and number inputted
        
        System.out.println("The factorial for " + number + " is " + factorial);

    }
    static void string(String[]args) {
        
    }
}