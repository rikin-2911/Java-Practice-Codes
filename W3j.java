public class W3j {
    public static void main(String[] args){
        int arr[] = {12, 1234, 45, 67, 1};
        int n = arr.length;
        int res = arr[0];
        for(int i = 0; i<n; i++){
            if(arr[i] < res){
                res = arr[i];
            }
        }
        System.out.println("The minimum number in the array is: "+ res);

        for(int i = 0; i<n; i++){
            if(arr[i] > res){
                res = arr[i];
            }
        }
        System.out.println("The maximu number in the array is: " + res);
    }
}