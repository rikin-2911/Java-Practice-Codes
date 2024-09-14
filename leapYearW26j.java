import java.util.Scanner;
public class leapYearW26j {
    public static void main(String[] args){
        int year = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year: ");
        year = input.nextInt();
        if(year > 2000){
            if(year % 4 == 0){
            System.out.print("The year " + year + " is a Leap Year.");
            }else{
                System.out.print("The year " + year + " is not a Leap Year.");
            }
        }else{
            if(year % 400 == 0){
                System.out.print("The year " + year + " is a Leap Year.");
            }else{
                System.out.print("The year " + year + " is not a Leap Year.");
            }
        }
        
    }
}
