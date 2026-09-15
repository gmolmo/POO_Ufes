import java.util.ArrayList;
import java.util.List;

public class Departamento {
	String nome;
	int n_funcionarios;
	int adicionados;
	List<Funcionario> funcionarios;

	public Departamento(String nome, int qtdFuncs) {
		this.nome = nome;
		this.n_funcionarios = qtdFuncs;
		this.adicionados = 0;
		this.funcionarios = new ArrayList<>();
	}
	public String getNome() {
		return this.nome;
	}
	public Funcionario[] getFuncionarios() {
		return this.funcionarios.toArray(new Funcionario[0]);
	}
	public void adicionar(Funcionario funcionario) {
		this.funcionarios.add(funcionario);
		adicionados++;
	}
	public void remover(int idx) {//FALTA ESSA
		this.funcionarios.remove(idx);
		this.adicionados--;
	}
	public void darAumento(double percentual) {
		for(int i = 0; i < this.adicionados; i++)
		{
			this.funcionarios.get(i).darAumento(percentual);
		}
	}
	public void transferir(int idxFunc, Departamento destino) {
		Funcionario f = this.funcionarios.get(idxFunc);
		this.funcionarios.remove(idxFunc);
		this.adicionados--;
		destino.adicionar(f);
	}//FALTA ESSA
	public double calcularCusto() {
		double custo = 0.0;
		for(int i = 0; i < this.adicionados; i++)
			custo+=this.funcionarios.get(i).getSalario();
		return  custo;
	}
}

