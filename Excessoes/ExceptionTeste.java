package Excessoes;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTeste {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Double ativoC = 0.0;
        Double ativoNC = 0.0;
        Double passivoC = 0.0;
        Double passivoNC = 0.0;
        Double patrimonioLiquido = 0.0;
        Boolean validacao = true;
        
         do{
             try{
                
            System.out.println("Digite o valor do Ativo circulante: ");
            ativoC = sc.nextDouble();

            System.out.println("Digite o valor do Ativo não circulante: ");
            ativoNC = sc.nextDouble();

            System.out.println("Digite o valor do Passivo circulante: ");
            passivoC = sc.nextDouble();

            System.out.println("Digite o valor do Passivo não circulante: ");
            passivoNC = sc.nextDouble();

            System.out.println("Digite o valor do Patrimônio líquido: ");
            patrimonioLiquido = sc.nextDouble();


            computar((ativoC + ativoNC ),   (passivoC + passivoNC), patrimonioLiquido);

            System.out.println("Os valores coincidem! O BP v2 está correto (Ativos: " + (ativoC + ativoNC ) + " e Passivos + Patrimonio Líquido: " + (passivoC + passivoNC + patrimonioLiquido) + " )");
            validacao = false;
        }catch(InputMismatchException e){
            System.out.println("Erro: não pode-se inserir letras, informe números.");
            sc.nextLine();
        
        }catch(BPV2 e){
            System.out.println("Erro: " + e );
            
        }
        }while (validacao);
       
    }

    static void computar(Double ativos, Double passivos, Double pl) throws BPV2 {
        if(ativos != (passivos + pl)){
            throw new BPV2(ativos, passivos, pl);
        }
        
    }
}
