import java.util.Scanner;
public class kthMinimumW42j {
    public static void main(String [] args){
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.print("Please enter the value of k such that 0 < k < length of arr: ");
        int k = input.nextInt();
        int arr[] = {22, 33, 88, 66, 54, 11, 847};
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        if(k == 0){
            System.out.print("Please select the appropriate number from the given range!");
        }else{
        System.out.print("The " + k + " minimum element in array is: " + arr[k-1] + ".");
        }
    }
}
