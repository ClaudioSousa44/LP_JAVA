public class Pedidos {
    private int codProd;
	private String descricao;
	private Double preco;


	public Pedidos(){}
	
	public Pedidos(int codProd, String descricao, Double preco){
		this.codProd = codProd;
		this.descricao = descricao;
		this.preco = preco;
	}

	public Pedidos(Pedidos p){
		this.codProd = p.getCodProd();
		this.descricao = p.getDescricao();
		this.preco = p.getPreco();
	}

    public void setCodProD(int codProd){
		this.codProd = codProd; 
	}

	public int getCodProd(){
		return codProd;
	}

	public void setDescricao(String descricao){
		this.descricao = descricao;
	}

	public String getDescricao(){
		return descricao;
	}

	public void setPreco(Double preco){
		this.preco = preco;
	}
	
	public Double getPreco(){
		return preco;
	}

    public void print(){
        System.out.println(this.codProd + this.descricao + this.preco);
    }

}
