import java.util.Scanner;
public class sumFirstNW29j {
    public static void main(String[] args){
        int N, sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number N for summation: ");
        N = input.nextInt();
        if(N == 0){
            System.out.println("Please enter valid natural number as number 0 is not a natural number!");
        }else{
            for(int i = 1; i <= N; i++){
                sum += i;
            }
        }
        System.out.print("The sum of first N natural numbers till " + N + " is: " + sum);

    }
}
