import java.util.Scanner;
public class TernaryOperW63j {
    public static void main(String [] args){
        String opt;
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        System.out.print("Please input an integer: ");
        double n = input.nextDouble();

        opt = (n > 0 | n == 0) ? ((n > 0) ? "The integer is POSITIVE." : "The integer is ZERO."):"The integer is NEGATIVE.";
        System.out.print(opt); 
        
    }
}

// This code is the example of the Ternary operator in JAVA !
// Also it is useful example of Nested Ternary Operator in JAVA !