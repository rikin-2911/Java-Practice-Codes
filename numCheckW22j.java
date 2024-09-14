import java.util.Scanner;
public class numCheckW22j {
    public static void main(String [] args){
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter any real number: ");
        n = input.nextInt();
        while(true){
            if(n == 0){
                System.out.println("The number you enter is Zero.");
                break;
            }
            if(n < 0){
                System.out.println("The number " + n + " is Negative number.");   
                break;
            }
            if(n > 0){
                System.out.println("The number " + n + " is Positive number.");
                break;
            }
        }
    }
}
