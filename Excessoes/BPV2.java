package Excessoes;

public class BPV2  extends Exception {
    private Double ativos;
    private Double ativoNaoCirculante;
    private Double passivos;
    private Double passivoNaoCirculante;
    private Double patrimonioLiquido;

    BPV2(Double ativos,Double passivos, Double Pl){
        this.ativos = ativos;
        this.passivos = passivos;
        patrimonioLiquido = Pl;
    }

    public String toString(){
        return "A soma dos passivos = " + ativos + " e a soma dos passivos + patrimônio líquido = " + (passivos + patrimonioLiquido);
    }


}
