import java.util.Scanner;
public class AdvCalcuW35j {
    public static void main(String [] args){
        //Message for starting of the calculator!
        int s1 = 0;
        
        @SuppressWarnings("resource")
        Scanner input1 = new Scanner(System.in);
        System.out.print("Please type '0' to start the calculations: ");
        int s2 = input1.nextInt();

        String s3 = new String("+");
        String s4 = new String("-");
        String s5 = new String("*");
        String s6 = new String("/");

        if(s1 == s2){
            while(true){
                @SuppressWarnings("resource")
                Scanner input2 = new Scanner(System.in);
                System.out.print("Enter the number for the calculations: ");
                int n1 = input2.nextInt();

                if(n1 > 0){
                    @SuppressWarnings("resource")
                    Scanner input3 = new Scanner(System.in);
                    System.out.print("Enter the operation among the operators +, - , * and /: ");
                    String s7 = input3.nextLine();

                    @SuppressWarnings("resource")
                    Scanner input4 = new Scanner(System.in);
                    System.out.print("Enter the other number: ");
                    int n2 = input4.nextInt();

                    if(s7 == (s3)){
                        int r = n1 + n2 ;
                        System.out.print("The result till now is: " + r);
                    }
                    if(s7 == s4){
                        int r = n1 - n2;
                        System.out.print("The result till now is: " + r);
                    }
                    if(s7 == s5){
                        int r = n1 * n2;
                        System.out.print("The result till now is: " + r);
                    }
                    if(s7 == s6){
                        int r = n1 / n2;
                        System.out.print("The result till now is: " + r);
                    }
                }else{
                    System.out.print("! Unfortunately you entered a negative number !");
                    break;
                }    
            }
        }    
    }
}
