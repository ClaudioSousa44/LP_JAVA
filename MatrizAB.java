import java.util.Scanner;
public class MatrizAB {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int [][] a = new int[2][2];
        int [][] b = new int[2][2];
        int [][] c = new int[2][2];
        int i, j;
        

        for(i = 0; i<2; i++){
            for(j=0; j<2; j++){
                System.out.println("Digite o valor da matriz A: ");
                a[i][j] = sc.nextInt();

                System.out.println("Digite o valor da matriz B: ");
                b[i][j] = sc.nextInt();
            }
        }

        for(i = 0; i<2; i++){
            for(j=0; j<2; j++){
                System.out.println("a soma de " + a[i][j] + " + " + b[i][j] + " = " + (a[i][j] + b[i][j])  );
                c[i][j] = a[i][j] + b[i][j];
            }
        }

    }
}
