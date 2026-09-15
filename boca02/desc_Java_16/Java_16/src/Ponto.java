public class Ponto {
	double x, y;
	public Ponto(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public double calcularDistancia(Ponto ponto) {
		double r;
		r = Math.sqrt((Math.pow((this.x-ponto.x), 2)) + (Math.pow((this.y-ponto.y), 2)));
		return r;
	}
}

