
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();

        int[][] mat = new int[l][l];

        for(int i = 0; i < l; i++)
        {
            for(int j = 0; j < l; j++)
            {
                mat[i][j] = sc.nextInt();
            }
        }

        char consulta = sc.next().charAt(0);

        boolean sup = true;
        boolean inf = true;

        for(int i = 0; i < l; i++)
        {
            for(int j = 0; j < l; j++)
            {
                if(i>j)
                {
                    if(mat[i][j] != 0)
                        sup = false;
                }
                else if(i < j)
                {
                    if(mat[i][j] != 0)
                        inf = false;
                }
            }
        }


        if(consulta == 'd')
        {
            if(sup && inf)
                System.out.println("A matriz é diagonal");
            else
                System.out.println("A matriz não é diagonal");
        }
        else if(consulta == 's')
        {
            if(sup)
                System.out.println("A matriz é diagonal superior");
            else
                System.out.println("A matriz não é diagonal superior");
        }
        else if(consulta == 'i')
        {
            if(inf)
                System.out.println("A matriz é diagonal inferior");
            else
                System.out.println("A matriz não é diagonal inferior");
        }
    }
}
