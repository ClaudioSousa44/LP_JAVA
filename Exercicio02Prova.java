import java.util.Scanner;
public class Exercicio02Prova {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        int n = 0; 
        double a = 0; 

        System.out.println("Digite o valor de n: ");
        n = scanner.nextInt();

        System.out.println("Digite o valor de a: ");
        a = scanner.nextDouble();

        Double res = Resultado(n, a);

        System.out.println(" O valor da sequencia é: " + res);

        scanner.close();

    } 

    public static Double Resultado(double n, double a){
        Double res = 0.0;
        while(n > 0){
            res = res + ( 1 / (n*a));
            n--;
        }
        return res;
    }
}
