public class Pessoa {
    private String nome;
    private String apelido;

     public void setNome(String nome) {
         this.nome = nome;
     }

     public void setApelido(String apelido) {
         this.apelido = apelido;
     }

     public void apresentacao(){
        System.out.println("Seu nome é " + this.nome + " e seu apelido é " + this.apelido);
     }
}
