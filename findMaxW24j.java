import java.util.Scanner;
public class findMaxW24j {
    public static void main(String [] args){
        int num1, num2, num3;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the first, Second and Third number respectively: ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
        if(num1 > num2 && num1 > num3){
            System.out.println("The maximum number is: " + num1);
        }
        if(num2 > num3 && num2 > num1){
            System.out.println("The maximum number is: " + num2);
        }
        if(num3 > num1 && num3 > num2){
            System.out.println("The maximum number is: " + num3);
        }
    }
}
