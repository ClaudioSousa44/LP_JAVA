import java.util.Scanner;
public class VerificarImparPar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor;
        System.out.println("Digite um valor: ");
        valor = sc.nextInt();
        verificarValor(valor);

    }

    public static void verificarValor(int valor){
    if(valor % 2 == 0){
    System.out.println("O valor " + valor + " é par.");
    }else{
    System.out.println("O valor " + valor + " é impar.");}
    return;
}
}


