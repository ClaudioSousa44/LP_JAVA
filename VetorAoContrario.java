import java.util.Scanner;

public class VetorAoContrario{
	public static void main(String [] args){
		
		Scanner entra = new Scanner(System.in);
		int [] numeros = new int[20];
		int contador;
		for(contador = 0; contador < 20; contador++){
			System.out.println("Digite o " + (contador+1) + " º número: ");
			numeros[contador] = entra.nextInt(); 
		}
		
		for(contador = 19; contador>= 0; contador--){
			System.out.println("O " + contador + "º é = " + numeros[contador]); 
		}
	}

}