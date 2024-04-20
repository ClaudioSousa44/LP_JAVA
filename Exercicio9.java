import java.util.Scanner;
public class Exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] Num = new int[5];
        
        for(int a = 0; a < 5; a++ ){
            System.out.println("Digite o " + a + " º valor:");
            Num[a] = sc.nextInt();
        }
        imprimirPos(Num);

    }

    public static void imprimirPos(int vet []){
        for(int b = 0; b < 5; b++){
            if(vet[b] >= 0){
                    System.out.println(" O valor " + vet[b] + " é positivo");
            }
        }
    }
}
