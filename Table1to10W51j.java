public class Table1to10W51j {
   public static void main(String[] args){
        int mat_10[][];
        mat_10 = new int[11][11];
        for(int i = 1; i <= 10; i++){
            for(int j = 1; j <= 10; j++){
                mat_10[i][j] = i * j;
                System.out.print(mat_10[i][j] + " ");
            }System.out.println();
        }System.out.println();
    }
}

