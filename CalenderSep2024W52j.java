public class CalenderSep2024W52j {
    public static void main(String[] args){
        int cald[][];
        cald = new int[6][7];
        int n = 1;
        for(int i = 0; i < 6 ; i++){
            for(int j = 0; j < 7; j++){
                cald[i][j] = n;
                n++;
                if(n > 31){
                    break;
                }
                System.out.print(cald[i][j] + " ");
            }System.out.println();
        }System.out.println();
    }
}