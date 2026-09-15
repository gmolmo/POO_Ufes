import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int l1,c1;
        l1 = sc.nextInt();
        if(l1 <= 0)
        {
            System.out.println("Dimensão Inválida");
            sc.close();
            System.exit(0);
        }
            
        c1 = sc.nextInt();
        if(c1 <= 0)
        {
            System.out.println("Dimensão Inválida");
            sc.close();
            System.exit(0);
        }

        float[][] mat1 = new float[l1][c1];

        for(int i = 0; i < l1; i++)
        {
            for(int j = 0; j < c1; j++)
            {
                mat1[i][j] = sc.nextFloat();
            }
        }
        
        int l2,c2;
        l2 = sc.nextInt();
        if(l2 <= 0)
                    {
            System.out.println("Dimensão Inválida");
            sc.close();
            System.exit(0);
        }
        c2 = sc.nextInt();
        if(c2 <= 0)
                    {
            System.out.println("Dimensão Inválida");
            sc.close();
            System.exit(0);
        }

        float[][] mat2 = new float[l2][c2];

        for(int i = 0; i < l2; i++)
        {
            for(int j = 0; j < c2; j++)
            {
                mat2[i][j] = sc.nextFloat();
            }
        }   

        if((c1 != l2))
        {
            System.out.println("Dimensões não compatíveis");
        }
        else
        {
            float matr[][] = new float[l1][c2];

        for (int i = 0; i < l1; i++)//multiplicacao
        {
            for(int j = 0; j < c2 ; j++)
                {
                    for(int k = 0; k < l2; k++)
                    {
                        matr[i][j] += mat1[i][k] * mat2[k][j];
                    }
                }    
        }
        for(int i = 0; i < l1; i++)
        {
            for(int j = 0; j < c2; j++)
            {
                System.out.printf("%.2f ",matr[i][j]);
            }
            System.out.printf("\n");
        }
        }
        sc.close();
    }
}
