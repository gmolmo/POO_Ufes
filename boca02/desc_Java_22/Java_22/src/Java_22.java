
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Java_22 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		List<Pessoa> pessoas = new ArrayList<>();

		while(true)
		{
			String line = sc.nextLine();

			if(line.charAt(0) == '.')
				break;

			String[] partes = line.split(";",3);
			String nome = partes[0].trim();
			int idade = Integer.parseInt(partes[1].trim());
			double altura = Double.parseDouble(partes[2].trim().replaceAll(",", "."));

			Pessoa p = new Pessoa(nome, idade, altura);

			pessoas.add(p);
		}

		Collections.sort(pessoas);
		for(int i = 0; i < pessoas.size(); i++)
		{
			System.out.println(pessoas.get(i).toString());
		}
		System.out.println("");

		Collections.sort(pessoas, new Pessoa.IdadeComparator());
				for(int i = 0; i < pessoas.size(); i++)
		{
			System.out.println(pessoas.get(i).toString());
		}
		System.out.println("");
		Collections.sort(pessoas, new Pessoa.AlturaComparator());
				for(int i = 0; i < pessoas.size(); i++)
		{
			System.out.println(pessoas.get(i).toString());
		}		
		System.out.println("");


		sc.close();
	}
}

