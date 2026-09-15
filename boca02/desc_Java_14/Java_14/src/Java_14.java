
import java.util.Scanner;

public class Java_14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();

		Aleatorio gera = new Aleatorio(n);

		for(int i = 0; i < 10; i++)
		{
			if(i == 5)
			{
				gera.renovar();
			}
			System.out.printf("%d ",gera.getNumero());
		}
		System.out.printf("\n");
		sc.close();
	}
}

