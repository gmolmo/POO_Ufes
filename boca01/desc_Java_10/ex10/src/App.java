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

        if((l1 != l2) || (c1 != c2))
        {
            System.out.println("Dimensões não compatíveis");
        }
        else
        {
            for(int i = 0; i < l1; i++)
            {
                for(int j = 0; j < c1; j++)
                {
                    float r = mat1[i][j] + mat2[i][j];
                    System.out.printf("%.2f ",r);
                }
                System.out.printf("\n");
            }
        }
        sc.close();
    }
}
