
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        while(x != y)
        {
            if(x < y)
            {
                int aux = x;
                x = y;
                y = aux;
            }
            else
                x = x- y;
            
        }
        
        System.out.println(""+x);
        
        sc.close();
    }
}
