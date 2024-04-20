import java.util.Scanner;

public class VetorVezes3{
	public static void main(String [] args){
		
		Scanner entra = new Scanner(System.in);
		int [] numeros = new int[15];
		int [] numerosVezes3 = new int[15];

		int contador;

		for(contador = 0; contador < 15; contador++){
			System.out.println("Digite o " + (contador+1) + " º número: ");
			numeros[contador] = entra.nextInt(); 
			numerosVezes3[contador] = numeros[contador] * 3; 
		}
		
		for(contador = 0; contador < 15; contador++){
			System.out.println("O " + contador + "º é = " + numerosVezes3[contador]); 
		}
	}

}