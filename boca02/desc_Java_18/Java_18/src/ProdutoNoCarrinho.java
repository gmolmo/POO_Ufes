public class ProdutoNoCarrinho {
	private int qtd;
	private Produto produto;

	public ProdutoNoCarrinho(int qtd, Produto produto) {
		this.qtd = qtd;
		this.produto = produto;
	}
	public double calcularPreco() {return this.qtd*this.produto.getPreco();}
	public int getQtd() {return this.qtd;}
	public Produto getProduto() {return this.produto;}
}

