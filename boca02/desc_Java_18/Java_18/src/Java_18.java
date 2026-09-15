import java.util.Locale;
import java.util.Scanner;

public class Java_18 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	int num = scanner.nextInt();

	scanner.nextLine(); // Despreza o \n.

	CarrinhoDeCompras c = new CarrinhoDeCompras(num);

	for (int i = 0; i < num; i++) 
	{
		String nome = scanner.nextLine();
		double preco = scanner.nextDouble();
		scanner.nextLine(); // Despreza o \n.
		int qtd = scanner.nextInt();
		scanner.nextLine(); // Despreza o \n.
		c.adicionar(nome, preco, qtd);
	}
	c.imprimir();
	System.out.printf(new Locale("pt", "BR"), "Total: R$ %.2f\n", c.calcTotal());
	System.out.println("");
	scanner.close();
	}
}

