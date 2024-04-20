import java.util.Scanner;
public class CalcularSoma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor1, valor2;
        System.out.println("Digite um valor: ");
        valor1 = sc.nextInt();

        System.out.println("Digite um  segundo valor: ");
        valor2 = sc.nextInt();

        
    }

    public static void calcularSoma(int a, int b){
        System.out.println(" A soma é: " + (a+b));
        return ;
    }
}
