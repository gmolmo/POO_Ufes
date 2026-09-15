
import java.util.Scanner;

public class Java_16 {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);

	double x1,y1,x2,y2,x3,y3;
	x1 = sc.nextDouble();
	y1 = sc.nextDouble();
	x2 = sc.nextDouble();
	y2 = sc.nextDouble();
	x3 = sc.nextDouble();
	y3 = sc.nextDouble();

	Triangulo tri = new Triangulo(x1,y1,x2,y2,x3,y3);

	System.out.printf("%.5f\n",tri.calcularPerimetro());

	sc.close();
	}
}

