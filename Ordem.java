package exercicio01;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Ordem {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date momento; 
	private OrdemStatus status;
	private Cliente clientes; 
	
	private List<OrdemItem> itens = new ArrayList<OrdemItem>();
	
	public Ordem() {
		
	}

	public Ordem(Date momento, OrdemStatus status, Cliente clientes) {
		super();
		this.momento = momento;
		this.status = status;
		this.clientes = clientes;
	}

	protected Date getMomento() {
		return momento;
	}

	protected void setMomento(Date momento) {
		this.momento = momento;
	}

	protected OrdemStatus getStatus() {
		return status;
	}

	protected void setStatus(OrdemStatus status) {
		this.status = status;
	}

	protected Cliente getClientes() {
		return clientes;
	}

	protected void setClientes(Cliente clientes) {
		this.clientes = clientes;
	}

	public void addItem(OrdemItem item) {
		itens.add(item);
	}
	
	public void removeItem(OrdemItem item) {
		itens.remove(item);
	}
	
	public Double total() {
		double soma = 0.0; 
		for(OrdemItem ite : itens){
			soma += ite.subTotal();
		}
		return soma;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Momento da pedido: ");
		sb.append(sdf.format(momento) + "\n");
		sb.append("Status da pedido: ");
		sb.append(status + "\n");
		sb.append("Cliente: ");
		sb.append(clientes + "\n");
		sb.append("\nDados do pedido:\n");
		for (OrdemItem item : itens) {
			sb.append(item + "\n");
		}
		sb.append("Preço total do pedido: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	
	}

}
