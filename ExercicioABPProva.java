import java.util.Scanner;

public class ExercicioABPProva{
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int controler = 0;

        while(controler == 0){
                System.out.println("Digite o valor de 4 digitos: (maior que 999 menor que 10000)");
                a = scanner.nextInt();
                if(a > 999 && a < 10000){
                    controler = 1;
                }
        }


       
        System.out.println("Digite o valor de 2 digitos:");
         b = scanner.nextInt();
               
        

        Encaixa(a, b);

        scanner.close();
        

    }

    public static void Encaixa(int a, int b){
        int resto = a % 100;
        
        if(resto == b){
            System.out.println( a + " " + b + " Encaixa");
        }else{
            System.out.println( a + " " +  b + " Não encaixa");
        }
    }
}
