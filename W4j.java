import java.util.Arrays;
public class W4j {
    public static void main(String[] args){
        int arr[] = {12, 1234, 45, 67, 1};
        int n = arr.length;
        Arrays.sort(arr);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + ",");
        }
    }
}