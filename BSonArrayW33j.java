import java.util.Scanner;
public class BSonArrayW33j {
    public static void main(String [] args){
        int arr[] = {-9,-7,-3,0,5,12,17,19,29,41,56,79};
        int n = arr.length;
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the target element from the array: ");
        int t = input.nextInt();
        int mid = (n / 2);
        if(t == arr[mid]){
            System.out.print("The target element " + t + " is FOUND\n");
            System.out.print("The index of element is: " + mid); 
        }
        else{

            if(t  < arr[mid]){
                for(int i = 0; i <= mid - 1; i++){
                    if(t == arr[i]){
                        System.out.print("The target element " + t + " is FOUND\n");
                        System.out.print("The index of element is: " + i);
                        break;
                    }else{
                        System.out.print("!! ELEMENT NOT FOUND !!");
                    
                    } 
                }
            }
            
            else{
                    for(int j = mid + 1; j < n; j++){
                        if(t == arr[j]){
                            System.out.print("The target element " + t + " is FOUND\n");
                            System.out.print("The index of element is: " + j);
                        
                        }else{
                            System.out.print("!! ELEMENT NOT FOUND !!");
                    
                        }
                    }    
                }        
            }
        }
    }
// Code is in construction stage. Some errors are there, will solve it soon!