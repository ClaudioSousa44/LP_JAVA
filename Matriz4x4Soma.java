import java.util.Scanner;
public class Matriz4x4Soma{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int vet [][] = new int[4][4];  
      int i, j;
      int soma = 0;

      for(i = 0; i < 4; i++){
        for(j = 0; j< 4; j++){
            System.out.println("Digite um valor: ");
            vet [i][j] = sc.nextInt();
        }
      }

      for(i = 0; i < 4; i++){
        for(j = 0; j< 4; j++){
           soma = soma + vet [i][j] ;
        }
      }

      System.out.println("A soma é engual: " + soma);

    }
}