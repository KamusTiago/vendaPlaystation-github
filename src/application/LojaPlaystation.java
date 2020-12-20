package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Clientes;
import entities.ItemDePedido;
import entities.Pedido;
import entities.Produto;
import entities.enums.PedidoStatus;

public class LojaPlaystation {
	
	//foi adicionado uma excessão no parse
	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
		
		//saida PLAISTASHION MODO BR
		
		System.out.println("----------SONY PLAISTASHION----------");
		System.out.println();
		
		System.out.println("Entre com os dados do cliente: ");
		System.out.println("Nome: ");
		String nome = sc.nextLine();
		System.out.println("Agora informe o e-mail do cliente: ");
		String email = sc.next();
		System.out.println("Informe a data de nascimento do cliente: ");
		Date nascimento = sdf.parse(sc.next());
		
		//instanciado dados do cliente
		Clientes cliente = new Clientes(nome, email, nascimento);
		
		System.out.println();
		System.out.println("Informe o Status do pedido:  ");
		PedidoStatus status = PedidoStatus.valueOf(sc.next());
		
		//instanciado dados do pedido
		Pedido pedido = new Pedido(new Date(), status, cliente);
		
		System.out.println("Quantos produtos deseja adicionar? ");
		int n = sc.nextInt();
		
		
		
		for (int i = 1; i <=n; i++) {
			System.out.println("Informe o " + i + "° produto: " );
			System.out.println("Nome do produto: ");
			sc.nextLine();
			String nomeDoProduto = sc.nextLine();
			System.out.println("Informe o preço do produto: ");
			double precoDoProduto = sc.nextDouble();
			System.out.println("Informe a quantidade: ");
			int quantidade = sc.nextInt();
			
			//instanciado dados do produto
			Produto p = new Produto(nomeDoProduto, precoDoProduto);
			
			//instanciado itens do pedido
			ItemDePedido ip = new ItemDePedido(quantidade, precoDoProduto, p);
			
			pedido.adicionarItens(ip);
		}
		
		System.out.println();
		System.out.println(pedido);
		
		
		sc.close();
	}

}
