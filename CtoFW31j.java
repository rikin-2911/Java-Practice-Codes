import java.util.Scanner;
public class CtoFW31j {
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        System.out.print("PLease enter the temperature in celsius: ");
        int c = input.nextInt();
        double f = 1.8 * c + 32.0; //If you want to get a perfect result in decimal make sure your RHS is in float or double(any of the one variable)
        double ans = (float)f;
        System.out.println("The temperature in Fahrenheit is: " + ans);
    }
}