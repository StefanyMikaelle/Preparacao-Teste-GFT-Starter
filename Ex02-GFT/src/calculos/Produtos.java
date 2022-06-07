package calculos;

public class Produtos {
	
	public String nome;
	public double preco;
	public int quantidade;
	
	public void  AddProdutos(int quantidade) {
		this.quantidade += quantidade;
	}
	public void  RemoveProduto (int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public double TotalValorEstoque() {
		return quantidade*preco;
	}
	
	public String toString() {
		return nome + ", $" + preco +
				", " + quantidade + 
				", Total: $" + 
				String.format("%.2f", TotalValorEstoque());
	}
}
