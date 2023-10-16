import java.util.Scanner;

public class moonGravity {

    private final static double moonGravity = 0.17;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input your weight: ");
        double myWeight = sc.nextDouble();
        sc.close(); 
        System.out.println("Your effective weight on the moon is: " + myWeight * moonGravity);
    
    }
}
