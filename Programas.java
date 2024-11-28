package exercicio01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Programas {

	public static void main(String[] args) throws ParseException {
	
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira os dados do cliente:");
		System.out.println("Nome:");
		String nome = sc.nextLine();
		System.out.println("Email:");
		String email = sc.next();
		System.out.println("Data do Aniversario: (DD/MM/YYYY)");
		Date aniversario = sdf.parse(sc.next());
		
		Cliente cliente = new Cliente(nome, email, aniversario);
		
		System.out.println("\nInsira os dados do pedido:");
		System.out.println("Status:");
		OrdemStatus status = OrdemStatus.valueOf(sc.next());
		Ordem ordem = new Ordem(new Date(), status, cliente);
		
		System.out.println("Quantos itens para esse pedido:");
		int n = sc.nextInt();
		for (int i=1; i<=n; i++) {
			System.out.println("\nInsira os dados do item "+i+ ":");
			System.out.println("Nome do produto:");
			sc.nextLine();
			String nomeProduto = sc.nextLine();
			System.out.println("Preço do produto:");
			double precoProduto = sc.nextDouble();
			System.out.println("Quantidade:");
			int quantidade = sc.nextInt();
			
			Produto produto = new Produto (nomeProduto, precoProduto);
			OrdemItem it = new OrdemItem(quantidade, precoProduto, produto);
			ordem.addItem(it);
		}
		 	System.out.println();
		 	System.out.println(ordem);
		 	
		 	sc.close();
	}

}
