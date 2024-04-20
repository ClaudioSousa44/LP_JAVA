
public class Pessoas {
    private int id;
    private String nome;
    private String endereco;

    public Pessoas(){}
    public Pessoas(int id, String nome, String endereco){
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
    }

    public void imprimirDados(){
        System.out.println("id : " + id);
        System.out.println("Nome : " + nome);
        System.out.println("endereco : " + endereco);
    }
}
