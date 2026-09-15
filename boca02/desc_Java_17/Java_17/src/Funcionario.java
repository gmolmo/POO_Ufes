

public class Funcionario {
	String nome;
	double salario;
	String data;
	Departamento dep;

	public Funcionario(String nome, double salario, String dataAdmissao) {
		this.nome = nome;
		this.salario = salario;
		this.data = dataAdmissao;
	}
	public String getNome() {
		return  this.nome;
	}
	public double getSalario() {
		return  this.salario;
	}
	public String getDataAdmissao() {
		return this.data;
	}
	public void setDepartamento(Departamento departamento) {
		this.dep = departamento;
	}
	public void darAumento(double percentual) {
		this.salario+= this.salario*percentual;
	}
}

