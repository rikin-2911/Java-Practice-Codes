import java.util.Scanner;
import java.lang.Math;
public class GForceW34j {
    public static void main(String [] args){
       final double G = 6.67 * Math.pow(10, -11);

        @SuppressWarnings("resource")
        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter the mass of object 1 in Kg : ");
        double m1 = input1.nextDouble();

        @SuppressWarnings("resource")
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter the mass of object 2 in Kg : ");
        double m2 = input2.nextDouble();

        @SuppressWarnings("resource")
        Scanner input3 = new Scanner(System.in);
        System.out.print("Enter the distance between the two object in metres: ");
        double d = input3.nextDouble();

        double r = d * d; // Because we need square of the distance to calculate the force!

        double F = G * ((m1 * m2) / r);

        System.out.println("The force between the two objects is: " + F + " Newton.");

    }
}
