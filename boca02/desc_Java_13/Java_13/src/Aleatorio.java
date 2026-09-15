import java.util.Random;

public class Aleatorio {
	private int max;
	private Random random;

	public Aleatorio(long seed) {
		this.max = 100;
		this.random = new Random(seed);
	}
	public Aleatorio(long seed, int max) {
		this.max = max;
		this.random = new Random(seed);
	}
	public int getNumero(){
		int n = this.random.nextInt(this.max);
		return n;
	}
}

