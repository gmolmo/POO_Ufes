
import java.util.HashMap;
import java.util.Scanner;

public class Java_20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		HashMap<Integer,Usuario> users = new HashMap<>();

		for(int i = 0; i < n; i++)
		{
			int rg = sc.nextInt();
			String nome = sc.nextLine();
			int idade = sc.nextInt();

			if(users.containsKey(rg))
			{
				System.out.println("Erro! RG já cadastrado. Digite os dados novamente");
			}
			else
			{
				Usuario u = new Usuario(rg, nome, idade);
				users.put(rg,u);
			}
		}

		while(true)
		{
			String line = sc.nextLine();

			if(line.isEmpty())
				break;

			String[] partes = line.split(" ");
			String busca = partes[1].trim();
			int rgBusca = Integer.parseInt(partes[0].trim());

			if(busca.equals("Nome"))
			{
				System.out.print(users.get(rgBusca).nome);
			}
			else if(busca.equals("Idade"))
			{
				System.out.print(users.get(rgBusca).idade);
			}
		}

		sc.close();
	}
}

