public class Metadinha {
    public static void main(String[] args) {
        int meia [][] = new int[8][8];
        int x, y;

        for(x = 0; x < 8 ; x++){
            for(y = 0; y < 8; y++){
                if( x >= y){
                    meia[x][y] = 1;
                }else{
                    meia[x][y] = 0;
                }
            }
        }

        for(x = 0; x < 8 ; x++){
            for(y = 0; y < 8; y++){
                    System.out.print(meia[x][y] + " | ");
                
            }
            System.out.println("");
        }
    }
}
