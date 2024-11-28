package exercicio01;

public class OrdemItem {
	
	private Integer quantidade; 
	private Double preco; 
	
	private Produto Produto;
	
	public OrdemItem() {
	}

	public OrdemItem(Integer quantidade, Double preco, Produto Produto) {
		this.quantidade = quantidade;
		this.preco = preco;
		this.Produto = Produto;
	}

	protected Integer getQuantidade() {
		return quantidade;
	}

	protected void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	protected Double getPreco() {
		return preco;
	}

	protected void setPreco(Double preco) {
		this.preco = preco;
	}

	protected Produto getProduto() {
		return Produto;
	}

	protected void setProduto(Produto produto) {
		Produto = produto;
	}

	public double subTotal() {
		return preco * quantidade;
	}

	@Override
	public String toString() {
		return getProduto().getNome()
				+ ", $"
				+ String.format("%.2f", preco)
				+ ", Quantidade: "
				+ quantidade
				+ ", Subtotal: $"
				+ String.format("%.2f", subTotal());
	}
	
	
	
	

}
