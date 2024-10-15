import java.util.Scanner;
public class LeftRightShiftW64j {
    public static void main(String [] args){
        @SuppressWarnings("resource")
        Scanner input  = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        int n = input.nextInt();
        System.out.println();
        
        int l = n << 1;
        System.out.print("The result after LEFT SHIFTING by 1 is: " + l + ".");
        System.out.println();

        int r = n >> 1;
        System.out.print("The result after RIGHT SHIFTING by 1 is: " + r + ".");
        System.out.println();
    }
}
