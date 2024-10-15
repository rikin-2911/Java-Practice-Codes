import java.util.Scanner;
import java.lang.Math;
public class PerSquareW36j {
    public static void main(String [] args){
        int value;
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number between 1 to 500: ");
        double n = input.nextInt();
        if(n > 1){

            if(Math.pow(n, 0.5) == ){
                System.out.print("The number " + n + " is the Perfect Square Number.");
            }else{
                System.out.print("The number " + n + " is Not a Perfect Square Number.");
            }
        }
        if(n > 500){
            System.out.print("Please enter the number in the given range of 1 to 500 !");
        }
    }
}
