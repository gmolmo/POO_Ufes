
import java.util.Scanner;

public class Java_12 { 
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int nAlunos = sc.nextInt();

        Aluno[] alunos = new Aluno[nAlunos];

        double mediaTurma = 0.0;

        for(int i = 0; i < nAlunos; i++)
        {
            String nome;
            double n1,n2,n3;

            nome = sc.next();
            n1 = sc.nextDouble();
            n2 = sc.nextDouble();
            n3 = sc.nextDouble();
            mediaTurma += n1;
            mediaTurma += n2;
            mediaTurma += n3;

            Aluno a = new Aluno(nome,n1,n2,n3);
            alunos[i] = a;
        }
        mediaTurma = mediaTurma/(nAlunos*3);
        // System.out.println("Media = "+mediaTurma);

        System.out.println("Nome,Nota,Situacao,Media");

        for(int i = 0; i < nAlunos; i++)
        {
            String situacao;
            String media;

            if(alunos[i].calcularMedia()>=7.0)
                situacao = "Aprovado";
            else
                situacao = "Prova Final";

            if(alunos[i].calcularMedia() >= mediaTurma)
                media = "Acima";
            else
                media = "Abaixo";

            System.out.printf("%s,%.1f,%s,%s\n",alunos[i].getNome(),alunos[i].calcularMedia(),situacao,media);
        }
        
        sc.close();
    } 
} 

