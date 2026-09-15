
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Java_15 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	List<Cliente> clientes = new ArrayList<>();

	String primeiroCliente = sc.next();
	Cliente primeiro = new Cliente(primeiroCliente);
	clientes.add(primeiro);
	sc.nextLine();//tentativa de comer o \n

	boolean menu = true;

	String line;

	while(menu)
	{
		line = sc.nextLine();

		if(!line.isEmpty())
		{
			char c = line.charAt(0);

			if(c == '.')
			{
				menu = false;
			}
			else if(c == '+')
			{
				String prox = sc.next();
				sc.nextLine();//comendo o \n
				primeiro = new Cliente(prox);
				clientes.add(primeiro);
			}
			else
			{
				primeiro.setCPF(line);
			}
		}
	}
	for(int i = 0; i < clientes.size(); i++)
	{
		String nome = clientes.get(i).getNome();
		String cpf = clientes.get(i).getCPF();
		if(cpf.isEmpty())
		{
			System.out.println(""+nome);
		}
		else
			System.out.println(""+nome+" "+cpf);
	}

	}
}

