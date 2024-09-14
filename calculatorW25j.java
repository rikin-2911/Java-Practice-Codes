import java.util.Scanner;
public class calculatorW25j {
    public static void main(String[] args){
    double num1, num2, result = 0, op = 0;
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter the first number for calculations: ");
    num1 = input.nextDouble();
    System.out.println("Please enter the second number for calculations: ");
    num2 = input.nextDouble();
    System.out.print("Please enter 01 for Add, 10 for Sub, 100 for Multiply and 101 for Division: ");
    op = input.nextDouble();
    if(op == 01){
        result = num1 + num2;
        System.out.print("The Addition of two numbers is: " + result);
    }
    if(op == 10){
        result = num1 - num2;
        System.out.print("The Subtraction of two numbers is: " + result);
    }
    if(op == 100){
        result = num1 * num2;
        System.out.print("The Multiplication of two numbers is: " + result);
    }
    if(op == 101){
        result = num1 / num2;
        System.out.print("The Division of two numbers is: " + result);
    }
    }
}
