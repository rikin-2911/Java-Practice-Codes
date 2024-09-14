import java.util.Scanner;
public class mulTableW28j {
    public static void main(String[] args){
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Please eneter the number for a multiplication table: ");
        n = input.nextInt();
        System.out.println("The multiplication table for " + n + " is: ");
        for(int i = 1; i <= 10; i++){
            System.out.println(n * i);
        }
    }
}
