import java.util.Scanner;
public class nthTermW32j{
    public static void main(String [] args){
        double an, sn = 0.0;
        @SuppressWarnings("resource")
        Scanner input1 = new Scanner(System.in);
        System.out.print("Please enter the first term a: ");
        double a = input1.nextDouble();

        @SuppressWarnings("resource")
        Scanner input2 = new Scanner(System.in);
        System.out.print("Please enter the common difference d: ");
        double d = input2.nextDouble();

        @SuppressWarnings("resource")
        Scanner input3 = new Scanner(System.in);
        System.out.print("Please enter the total numbers of terms n: ");
        double n = input3.nextDouble();

        an = a + (n - 1) * d; // This will give you the nth term in the sequence!
        System.out.println("The nth term in the sequence is: " + an);

        sn = n/2 * (2 * a + (n - 1) * d);
        System.out.println("The sum of the arithmetic progression till n terms is: " + sn);

    }
}