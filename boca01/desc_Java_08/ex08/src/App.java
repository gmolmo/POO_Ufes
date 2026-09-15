
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int l,c;
        c = sc.nextInt();
        l = sc.nextInt();

        float[][] mat = new float[l][c];
        
        for(int i = 0; i < l; i++)
        {
            for(int j = 0; j < c; j++)
            {
                mat[i][j] = sc.nextFloat();
            }
        }
        
        for(int i = 0; i < l; i++)
        {
            for(int j = 0; j < c; j++)
            {
                System.out.printf("%.2f ",mat[i][j]);
            }
                System.out.printf("\n");
        }

        sc.close();
    }
}
