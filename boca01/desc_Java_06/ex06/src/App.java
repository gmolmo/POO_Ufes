import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        float[][] mat1 = new float[5][4];
        float[][] mat2 = new float[4][6];
        float[][] matr = new float[5][6];

        for(int i = 0; i < 5; i++)//init matresult
        {
            for(int j = 0; j < 4; j++)
            {
                matr[i][j] = 0;
            }
        }

        for(int i = 0; i < 5; i++)//leitura 1
        {
            for(int j = 0; j < 4; j++)
            {
                mat1[i][j] = sc.nextFloat();
            }
        }
        for(int i = 0; i < 4; i++)//leitura 2
        {
            for(int j = 0; j <6; j++)
            {
                mat2[i][j] = sc.nextFloat();
            }
        }

        for (int i = 0; i < 5; i++)//multiplicacao
        {
            for(int j = 0; j < 6 ; j++)
                {
                    for(int k = 0; k < 4; k++)
                    {
                        matr[i][j] += mat1[i][k] * mat2[k][j];
                    }
                }    
        }

        for(int i = 0; i < 5; i++)//impressao
        {
            for(int j = 0; j < 6; j++)
            {
                System.out.printf("%.2f ",matr[i][j]);
            }
            System.out.printf("\n");
        }

        sc.close();
    }
}
