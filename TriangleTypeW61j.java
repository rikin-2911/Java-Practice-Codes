import java.util.Scanner;
public class TriangleTypeW61j {
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n1 = input1.nextInt();
        System.out.println();
        
        @SuppressWarnings("resource")
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter the second number: ");
        int n2 = input2.nextInt();
        System.out.println();

        @SuppressWarnings("resource")
        Scanner input3 = new Scanner(System.in);
        System.out.print("Enter the third number: ");
        int n3 = input3.nextInt();
        System.out.println();

        if(n1 + n2 > n3){
            System.out.print("This is a Valid Triangle.");
            System.out.println();
        }else 
        if(n2 + n3 > n1){
            System.out.print("This is a Valid Triangle.");
            System.out.println();
        }else
        if(n3 + n1 > n2){
            System.out.print("This is a Valid Traingle.");
            System.out.println();
        }else{
            System.out.println("This is Not a Valid Triangle.");
            System.out.println();
        }

        if(n1 == n2 & n2 == n3){
            System.out.print("This is an Equilateral Triangle.");
            System.out.println();
        }else 
        if((n1 == n2 & n2 != n3) | (n2 == n3 & n3 != n1) | (n3 == n1 & n1 != n2)){
            System.out.print("This is an Isosceles Triangle.");
            System.out.println();
        }else
        if(n1 != n2 & n2 != n3 & n3 != n1){
            System.out.print("This is a Scalene Triangle.");
            System.out.println();
        }
    }
}
