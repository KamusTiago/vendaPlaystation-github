package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.PedidoStatus;

public class Pedido {

	private Date momento;
	private PedidoStatus status;
	
	private Clientes cliente;
	private List<ItemDePedido> itens = new ArrayList<ItemDePedido>();
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
	
	public Pedido() {
	}

	public Pedido(Date momento, PedidoStatus status, Clientes cliente) {
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}

	public Clientes getCliente() {
		return cliente;
	}

	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public PedidoStatus getStatus() {
		return status;
	}

	public void setStatus(PedidoStatus status) {
		this.status = status;
	}
	
	public void adicionarItens(ItemDePedido item) {
		itens.add(item);
	}
	
	public void removerItens(ItemDePedido item) {
		itens.remove(item);
	}
	
	public double total() {
		double soma = 0.0;
		for (ItemDePedido item : itens ) {
			soma += item.subTotalProduto();
		}
		return soma;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("----------SONY PLAISTATION----------\n");
		sb.append(sdf.format(momento) + "\n");
		sb.append("Status do pedido: ");
		sb.append(status + "\n");
		sb.append("Cliente: ");
		sb.append(cliente + "\n");
		sb.append("Itens no pedido: ");
		for (ItemDePedido item : itens) {
			sb.append(item + "\n");
		}
		sb.append("Valor total: R$");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
	
}
