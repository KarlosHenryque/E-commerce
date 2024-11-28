package exercicio01;

public class Produto {
	
	private String nome; 
	private double preco; 
	
	public Produto() {
	}

	public Produto(String nome, double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}

	protected String getNome() {
		return nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}

	protected double getPreco() {
		return preco;
	}

	protected void setPreco(double preco) {
		this.preco = preco;
	}
	
	

}
