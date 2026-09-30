import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = 1; // Initialize x to 1 to enter the loop

        while (x == 1) {
            int a = 1; // Reset a to 1 for each iteration
            System.out.println("Enter any number:");
            int n = scn.nextInt();

            if (n == 0 || n == 1) {
                a = 0;
            }

            for (int i = 2; i <= n / 2; i++) { // Optimize loop to run till n/2
                if (n % i == 0) {
                    a = 0;
                    break;
                }
            }
            if (a == 1) {
                System.out.println("Prime Number");
            } else {
                System.out.println("Not Prime");
            }

            System.out.println("Press 1 to continue, any other number to exit:");
            x = scn.nextInt();
        }

        scn.close();
    }
}