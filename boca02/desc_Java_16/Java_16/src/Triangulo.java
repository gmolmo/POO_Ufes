public class Triangulo {
	Ponto v1,v2,v3;
	public Triangulo(Ponto vertice1, Ponto vertice2, Ponto vertice3) {
		this.v1 = vertice1;
		this.v2 = vertice2;
		this.v3 = vertice3;
	}
	public Triangulo(double x1, double y1, double x2, double y2, double x3, double y3) {
		Ponto v1 = new Ponto(x1,y1);
		Ponto v2 = new Ponto(x2,y2);
		Ponto v3 = new Ponto(x3,y3);

		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
	}
	public double calcularPerimetro() {
		double p;
		p = v1.calcularDistancia(v2) + v2.calcularDistancia(v3) + v3.calcularDistancia(v1);
		return p;
	}
}

