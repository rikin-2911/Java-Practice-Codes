import java.util.Scanner;
public class evenOddW23j {
    public static void main(String[] args){
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter any real number: ");
        n = input.nextInt();
        if(n % 2 == 0){
            System.out.println("The number " + n + " is a Even number.");
        }else{
            System.out.println("The number " + n + " is Odd number.");
        }
    }
}
