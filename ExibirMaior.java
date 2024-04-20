import java.util.Scanner;

public class ExibirMaior{
	public static void main(String [] args){
		
		Scanner entra = new Scanner(System.in);
		int[] numeros = new int[5];
	
		int contador;
		int maior = 0;

		for(contador = 0; contador< 5 ; contador++){
			System.out.println("Digite o " + (contador+1) + " º número: ");
			numeros[contador] = entra.nextInt(); 
		}

		int base = 0;
		maior = numeros[0];
		for(contador = 1; contador < 5 ; contador++){
			if(numeros[contador] > maior){
				maior = numeros[contador];
			}
			
		}
		
		System.out.println(maior);
	}

}