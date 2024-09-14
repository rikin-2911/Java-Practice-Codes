import java.util.Scanner;

public class factorialW21j {
    public static void main(String[] args) {
        double n;
        double product = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        n = input.nextDouble();
        if (n == 0 || n == 1) {
            if (n == 0) {
                System.out.println("The factorial of 0 is: 1");
            }
            if (n == 1) {
                System.out.println("The factorial of 1 is: 1");
            }
        } else {
            for (int i = 1; i < n + 1; i++) {
                product *= i;
            }
        }
        System.out.println("The factorial of " + n + " is: " + product);
    }
}