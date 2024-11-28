package exercicio01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private String nome; 
	private String email; 
	private Date aniversario; 
	
	public Cliente() {
	}

	public Cliente(String nome, String email, Date aniversario) {
		super();
		this.nome = nome;
		this.email = email;
		this.aniversario = aniversario;
	}

	protected String getNome() {
		return nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}

	protected String getEmail() {
		return email;
	}

	protected void setEmail(String email) {
		this.email = email;
	}

	protected Date getAniversario() {
		return aniversario;
	}

	protected void setAniversario(Date aniversario) {
		this.aniversario = aniversario;
	}

	@Override
	public String toString() {
		return nome + " (" + sdf.format(aniversario) + ") - " + email;
	}
	
	
	

}
