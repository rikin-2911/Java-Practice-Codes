import java.util.Scanner;
public class PrimeFactorsW65j {
    public static void main(String [] args){
        int num;
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter any number: ");
        num = input.nextInt();
        System.out.println();
        
        int cnt = 0;
        for(int i = 2; i <= num / 2; i++){
            if(num % i == 0){
                cnt++;
                break;
            }
        }
        if(cnt == 0 & num != 1){
            System.out.print(num + " is a Prime number.");
            System.out.println();
        }
        else{
            System.out.print(num + " is Not a Prime number.");
            System.out.println();
            System.out.print("The factors of " + num + " are: ");
            System.out.println();
            for(int i = 1; i<= num; i++){
                if(num % i == 0){
                    System.out.print(i + " ");
                }
            }
        }
    }
} 
