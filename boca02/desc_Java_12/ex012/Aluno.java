public class Aluno {
    String nome;
    double nota1;
    double nota2;
    double nota3;
    
    public Aluno(String nome, double nota1, double nota2, double nota3)
    {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    public String getNome()
    {
        return this.nome;
    }
    public double calcularMedia()
    {
        return ((this.nota1+this.nota2+this.nota3)/3);
    }
}
