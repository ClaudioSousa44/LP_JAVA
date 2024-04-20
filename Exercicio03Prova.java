import java.util.Scanner;

public class Exercicio03Prova{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int cont = 0;
        int n = 0;

        while(cont == 0){
            System.out.println("Digite o valor de n");
            n = scanner.nextInt();
            if(n == 1 || n == 2 || n == 3 ){
                cont = 1;
            }else{
                System.out.println("Valor inválido. Tente novamente");
            }
        }
        int [][] a = new int[5][5];
        F3(a);

        if(n == 2){
            F2();
        }else if(n ==1){
            
            System.out.println("Valor da soma: " + F1());
        }else{
            
        }
        String ab = "oioi";
        if(ab.startsWith("oi")){
            System.out.println("comeca");
        }

    }

    public static int F1 (){
        Scanner scanner = new Scanner(System.in);
        int [] VetA = new int[20];
        int soma = 0;
        for(int cont = 0; cont < 20; cont++){
            System.out.println("Digite o valor do index " + "[" + cont + "]");
            VetA[cont] = scanner.nextInt();
            if(VetA[cont] % 2 == 0 && VetA[cont] % 3 == 0){
                soma = soma + VetA[cont];
            }
        }

        return soma;
    }

    public static void F2(){
        Scanner scanner = new Scanner(System.in);
        int [] vetA = new int[15];
        int [] vetB = new int[15];
        int soma = 0;
        
        for(int cont = 0; cont < 15; cont++){
            System.out.println("Digite o valor do index " + "[" + cont + "]");
            vetA[cont] = scanner.nextInt();
            soma = 0;
            int teste = vetA[cont];
            while(teste > 0){
                soma = soma + teste;
                teste--;
            }
            
            vetB[cont] = soma;
        }

        for(int cont = 0; cont < 15; cont++){
            System.out.print("Vetor A" + "[" + vetA[cont] + "]      ");
            System.out.print("Vetor B" + "[" + vetB[cont] + "]");
            System.out.println("");
        }

    }

    public static void F3(int[][] a){

    }
}