public class Clientes {
    private int codCli;
	private String nomeCli;
	private String enderecoCli;
	private String telefone;
    private Double preco;

	public Clientes(){}

	public Clientes(int codCli, String nome, String enderecoCli, String telefone){
		this.codCli = codCli;
		this.nomeCli = nome;
		this.enderecoCli = enderecoCli;
		this.telefone = telefone;

	}

	public Clientes(Clientes c){
		this.codCli = c.getCodCli();
		this.nomeCli = c.getNomeCli();
		this.enderecoCli = c.getEnderecoCli();
		this.telefone = c.getTelefone();
		
	}

    public void setCodCli(int codCli){
		this.codCli = codCli;
	}
	
	public int getCodCli() {
		return this.codCli;
	}

	public void setNomeCli(String nomeCli){
		this.nomeCli = nomeCli;
	}

	public String getNomeCli(){
		return nomeCli;
	}

	public void setEndereco(String enderecoCli){
		this.enderecoCli = enderecoCli;
	}

	public String getEnderecoCli(){
		return enderecoCli;
	}

	public void setTelefone(String telefone){
		this.telefone = telefone;
	}

	public String getTelefone(){
		return telefone;
	}

}
