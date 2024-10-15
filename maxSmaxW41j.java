public class maxSmaxW41j {
    public static void main(String[] args){
        int a[] = {22,33,88,66,54,11,847};
        int n = a.length;
        int max = a[0];  // We will compare elements one by one, starting from the first element. Store the first element in a variable named max
        int index = 0;   //  (0,      ,n-1)
        for (int i=0; i<n; i++)  //  iterate array elements from array[1] onwards, if an element is greater than max, update value of max, and note the position i in a variable index.
           {
               if (max < a[i])
                   {
                      max = a[i];
                      index = i;
                   }
           }
       // index contains the position of max element
       // swap max with last element
       int temp = a[index];
       a[index] =  a[n-1];
       a[n-1] = temp;
        System.out.print("Maximum element: " + a[n - 1] + ".");
        System.out.println();
       // Now a[n-1] holds maximum element of the array a.
       // Now we need to find maximum element of the remaining array [ 0, n-2]
       // again start comparing from a[0] 
       max = a[0];
       for (int i=0; i<n-1; i++)   // (0, n-2)
           {
               if (max < a[i])
               max = a[i];
               
           }
       // now max holds the second largest element 

       System.out.println("Second maximum element: "+ max + ".");

    }
}