package entities;


 //Entidade produto criada para registrar nome e preço do produto.
public class Produto {

	private String nome;
	private Double preco;

	public Produto() {
	}

	public Produto(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}
	//metodo toString criado para facilitar a saida de dados
	public String toString() {
		return "O produto: "
				+ nome
				+ " está no valor de $"
				+ preco;
	}
}
