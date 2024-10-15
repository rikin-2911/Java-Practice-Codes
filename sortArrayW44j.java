
public class sortArrayW44j {
    public static void main(String[] args){
        int arr[] = {22, 33, 88, 66, 54, 11, 847};
        int median;
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
        System.out.print("The sorted array is: \n");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + "  ");
        }
        
        System.out.println();

        System.out.println("The median of the array is: ");
        if(n/2 != 0){
            median = (n + 1) / 2;
            System.out.print(arr[median]);
        }else{
            median = ((n / 2) + ((n / 2) + 1)) / 2;
            System.out.print(arr[median]);
        }
    }
}
