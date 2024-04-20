public class PessoaFisica extends Pessoa {
    private String cnpj;
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void falarCnpj(){
        System.out.println("Seu cnpj é " + this.cnpj);
    }
}
