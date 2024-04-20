import java.util.Scanner;

public class Teste4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vet1[] = new int[10];
        
        int vet2[] = new int[5];
        int i,j;
        int result = 0;
        int cont = 5;
        

        for(i = 0; i < 10; i++){
            System.out.println("digite o valor:");
            vet1[i] = sc.nextInt();
        }

        for(j = 0; j < 5; j++){
            System.out.println("digite o valor:");
            vet2[j] = sc.nextInt();
        }

        for(i = 0; i < 10 ; i++){
            
            if(cont== 0){
                System.out.println("ninguem divide ele");
            }
            System.out.println("Numero: " + vet1[i]);
            for(j = 0; j < 5; j++){
                 cont = 0;
                
               result = vet1[i] % vet2[j];
               if(result == 0){
                System.out.println("é divisivel por " + vet2[j]);
                cont++;
               }
            }
        }
    }
}
