import java.util.Scanner;

public class MatrizSomaPos {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vet[][][] = new int[3][3][3];

        int i, j, z;

        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++){
                for(z = 0; z < 3; z++){
                    
                    vet[i][j][z] = i + j + z;
                }
            }
        }
        
        for(i = 0; i < 3; i++){
            System.out.println("");
            for(j = 0; j < 3; j++){
                System.out.println("");
                for(z = 0; z < 3; z++){
                    System.out.print( "[ " +  i + " ]" + "[ " +  j + " ]" + "[ " +  z + " ] = " + vet[i][j][z] + " | " );
                    
                }
            }
        }
    }
}
