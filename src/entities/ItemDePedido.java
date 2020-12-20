package entities;

public class ItemDePedido {

	private Integer quantidade;
	private Double preco;

	private Produto produto;

	public ItemDePedido() {
	}

	public ItemDePedido(Integer quantidade, Double preco, Produto produto) {
		this.quantidade = quantidade;
		this.preco = preco;
		this.produto = produto;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public Double getPreco() {
		return preco;
	}
	
	public double subTotalProduto() {
		return quantidade * preco;
	}
	
	
	 @Override public String toString() {
		return produto.getNome()
				+ ", $"
				+ String.format("%.2f", preco)
				+ ", quantidade: "
				+ quantidade
				+ " Subtotal: R$ "
				+  subTotalProduto();
	}
}
