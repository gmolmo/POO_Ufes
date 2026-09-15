import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int ant1 = 0,ant2 = 1;

        for(int i = 0; i < n; i++)
        {
            if(i == 0 || i == 1)
                System.out.printf("%d ",i);
            else
            {
                int r = ant1+ant2;
                System.out.printf("%d ",r);
                ant1 = ant2;
                ant2 = r;
            }
        }
        System.out.printf("\n");


        sc.close();
    }
}
