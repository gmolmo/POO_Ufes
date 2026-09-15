
import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

public class Pessoa implements Comparable<Pessoa> {
	String nome;
	int idade;
	double altura;
private static final Collator collator = Collator.getInstance(new Locale("pt", "BR"));
	public Pessoa(String nome, int idade, double altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}
	public int compareTo(Pessoa o) {
		return collator.compare(this.nome,o.nome);
	}
	public String toString() {
		String alturaComVirgula = String.format(new Locale("pt", "BR"), "%.2f", this.altura);
    	return this.nome + " (" + this.idade + " anos, " + alturaComVirgula + " metros)";

	}//Dwight Howard (33 anos, 2,11 metros)
	public static class IdadeComparator implements Comparator<Pessoa> {
		public int compare(Pessoa o1, Pessoa o2) {
			return o2.idade - o1.idade;
		}
	}
	public static class AlturaComparator implements Comparator<Pessoa> {
		public int compare(Pessoa o1, Pessoa o2) {
			return Double.compare(o1.altura, o2.altura);
		}
	}
}

