import java.util.Scanner;

public class Java_17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String nome = sc.next();
		String cnpj = sc.next();
		int nDeptos = sc.nextInt();
		sc.nextLine();

		Empresa emp = new Empresa(nome,cnpj,nDeptos);

		for(int i = 0; i < nDeptos; i++)
		{
			String nomeDepto = sc.next();
			int nFuncs = sc.nextInt();
			sc.nextLine();


			Departamento dep = new Departamento(nomeDepto,nFuncs);

			for(int j = 0; j < nFuncs; j++)
			{
				String nomeFunc = sc.next();
				double sal = sc.nextDouble();
				String data = sc.next();
				sc.nextLine();


				Funcionario func = new Funcionario(nomeFunc, sal, data);

				dep.adicionar(func);
			}

			emp.adicionar(dep);
		}

		emp.darAumento(0, 0.1);
		emp.transferir(0, 0, 1);

		emp.imprimir();

		sc.close();
	}
}

