import java.util.Scanner;
public class BitwiseEvenOddW62j {
    public static void main(String[] args){
        System.out.print("Even - Odd checking on the input integer.");
        System.out.println();
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        System.out.print("Please input an integer: ");
        double n1 = input.nextDouble();
        System.out.println();
        
        if(n1 % 2 == 0){
            System.out.print("The input integer is an EVEN integer.");
            System.out.println();
        }else{
            System.out.print("The input integer is an ODD integer.");
            System.out.println();
        }

        System.out.println();
        System.out.print("Now for the bitwise operators testing, please input two integers.");
        System.out.println();
        System.out.print("Please input 0's and 1's for better understanding of the results !");
        System.out.println();
        @SuppressWarnings("resource")
        Scanner input1 = new Scanner(System.in);
        System.out.print("Please enter first number: ");
        int num1 = input1.nextInt();
        System.out.println();

        @SuppressWarnings("resource")
        Scanner input2 = new Scanner(System.in);
        System.out.print("Please enter the second number: ");
        int num2 = input2.nextInt();
        System.out.println();

        int a1 = num1 & num2;
        System.out.print("The result of bitwise AND operator is: " + a1 + ".");
        System.out.println();

        int a2 = num1 | num2;
        System.out.print("The result of bitwise OR operator is: " + a2 + ".");
        System.out.println();

        int a3 = num1 ^ num2;
        System.out.print("The result of bitwise XOR operator is: " + a3 + ".");
        System.out.println();

    }
}
