
import java.util.Locale;

public class CarrinhoDeCompras {
	int qtd;
	ProdutoNoCarrinho[] produtos;
	int prodAdd;

	public CarrinhoDeCompras(int qtd) {
		this.qtd = qtd;
		this.produtos = new ProdutoNoCarrinho[qtd];
	}
	public void adicionar(String nomeProduto, double precoProduto, int qtd) {
		Produto p = new Produto(nomeProduto, precoProduto);
		ProdutoNoCarrinho pc = new ProdutoNoCarrinho(qtd, p);
		this.produtos[prodAdd] = pc;
		this.prodAdd++;
	}
	public double calcTotal() {
		double total=0;
		for(int i = 0; i < this.prodAdd; i++)
		{
			total+=this.produtos[i].calcularPreco();
		}
		return total;
	}
	public void imprimir() {
		System.out.println("No carrinho:");
		for(int i = 0; i < this.prodAdd; i++)
		{
			ProdutoNoCarrinho pc = this.produtos[i];
			Produto p = pc.getProduto();

System.out.printf(new Locale("pt", "BR"), "* %dx %s = R$ %.2f\n", pc.getQtd(), p.getNome(), pc.calcularPreco());
		}
	}
	}
// No carrinho:
// * 3x Papel A4 = R$ 34,20
// * 2x Fita adesiva = R$ 9,98
// * 5x Caneta = R$ 10,45
// Total: R$ 54,63
