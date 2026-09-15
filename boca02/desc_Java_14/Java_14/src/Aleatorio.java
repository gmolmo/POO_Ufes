
import java.util.Random;

// public class Aleatorio {
// 	public Aleatorio() {}
// 	public Aleatorio(int max) {}
// 	public int getNumero() {}
// 	public void renovar() {}
public class Aleatorio {
	private int maximo;
	private Random random;
	private long sem;

	public Aleatorio(long seed) {
		this.maximo = 100;
		this.sem = seed;
		this.random = new Random(seed);
	}
	public Aleatorio(long seed, int max) {
		this.maximo = max;
		this.sem = seed;
		this.random = new Random(seed);
	}
	public int getNumero() {
		int n = this.random.nextInt(this.maximo);
		return n;
	}
	public void renovar(){
		this.random = new Random(this.sem);
	}
}

