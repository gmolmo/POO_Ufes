public class Empresa {
	String nome;
	String cnpj;
	int nDeptos;
	int nDeptosAdd;
	Departamento[] departamentos;
	public Empresa(String nome, String cnpj, int qtdDeptos) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.nDeptos = qtdDeptos;
		this.nDeptosAdd = 0;
		this.departamentos = new Departamento[qtdDeptos];
	}
	public String getNome() {
		return  this.nome;
	}
	public String getCnpj() {
		return this.cnpj;
	}
	public Departamento[] getDepartamentos() {
		return  this.departamentos;
	}
	public void adicionar(Departamento departamento) {
		this.departamentos[this.nDeptosAdd] = departamento;
		this.nDeptosAdd++;
	}
	public void darAumento(int idx, double percentual) {
		this.departamentos[idx].darAumento(percentual);
	}
	public void transferir(int idxDeptoOrigem, int idxFunc, int idxDeptoDestino) {
		this.departamentos[idxDeptoOrigem].transferir(idxFunc, this.departamentos[idxDeptoDestino]);
	}
	public void imprimir() {
		for(int i = 0; i < this.nDeptosAdd; i++)
		{
			System.out.printf("%s R$ %.2f\n",this.departamentos[i].getNome(),this.departamentos[i].calcularCusto());
		}
		
	}
}

