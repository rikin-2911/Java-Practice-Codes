//Basic Statistics calculation program using Java!

import java.util. Arrays;
import java.lang.Math;


public class W5j {
    //#Function 1 for calculating Sum of the integer sequence.
    public static int Sum(int a[]){
        int arr[] = {23, 1234, 12, 67, 11, 34};
        int n = arr.length;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum = sum + arr[i];
        }
        return sum;
    }
    
    //#Function 2 for calculating Average of integer sequence.
    public static double Avg(int a[]){
        int sq[] = {23, 1234, 12, 67, 11, 34};
        double k = sq.length;
        double total = 0;
        for(int i = 0; i < k; i++){
            total = total + sq[i];
        }
        double avg = total / k ;
        return avg;
    }

    //#Function 3 for calculating Median of integer sequence.
    public static int Median(int a[]){
        int sq[] = {23, 1234, 12, 67, 11, 34};
        Arrays.sort(sq);
        int n = sq.length;
        if(n/2 != 0){
            int median = (n + 1) / 2;
            int i = median;
            System.out.print(sq[i]);
            return sq[i];
        }else{
            int median = ((n / 2) + ((n / 2) + 1)) / 2;
            int i = median;
            return sq[i];
        }
    }

    //#Function 4 for calculating Standard Deviation of the integer sequence. 
    public static double Std_dev(int a[]){
        int sq[] = {23, 1234, 12, 67, 11, 34};
        int n = sq.length;
        double d = 0;
        double avg = Avg(sq); //Because avg is already known to us...
        for(int i = 0; i < n; i++){
            d = d + Math.pow((sq[i] - avg), 2);
        }
        double d1 = d / n;
        double d2 = Math.sqrt(d1);
        return d2;
    }

    //Main Function for Testing...
    public static void main(String[] args){
            int arr[] = {23, 1234, 12, 67, 11, 34};
            int n = arr.length;
            System.out.print("The sum of the sequence is: " + Sum(arr));
            System.out.println();
            System.out.print("The average of the sequence is: " + Avg(arr));
            System.out.println();
            System.out.print("The median of the sequence is: " + Median(arr));
            System.out.println();
            System.out.print("The standard deviation of the sequence is: " + Std_dev(arr));
    }
}