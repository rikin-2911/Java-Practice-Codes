
public class MatMultiW54j {
    public static void main(String[] args){
        int mat1[][] = {{1,1,3}, {1,2,1}, {2,3,1}};
        int mat2[][] = {{1,1,0}, {0,1,2}, {3,2,1}};
        int mat3[][];
        mat3 = new int[3][3];
        System.out.print("The 3 x 3 matrix multiplication is: ");
        System.out.println();
        System.out.println();
        for(int i = 0; i < 3; ++i){
            for(int j = 0; j < 3; ++j){
                for(int k = 0; k < 3; k++){
                    mat3[i][j] += mat1[i][k] * mat2[k][j];
                    
                }System.out.print(mat3[i][j] + " ");
            }System.out.println();
        }System.out.println();
    }
}
