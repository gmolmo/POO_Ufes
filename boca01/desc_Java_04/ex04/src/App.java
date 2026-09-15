import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int[] numeros =  new int[10];

        numeros[0] = sc.nextInt();
        numeros[1] = sc.nextInt();
        numeros[2] = sc.nextInt();
        numeros[3] = sc.nextInt();
        numeros[4] = sc.nextInt();
        numeros[5] = sc.nextInt();
        numeros[6] = sc.nextInt();
        numeros[7] = sc.nextInt();
        numeros[8] = sc.nextInt();
        numeros[9] = sc.nextInt();

        int x = sc.nextInt();
        int maior = 0, menor = 0, igual = 0;

        boolean crescente = true;
        boolean decrescente = true;

        int m1 = 0,m2 = 1,dif = 0;

        for (int i = 0; i < 9; i++) {

            int dife = numeros[i+1]-numeros[i];
            if(dife < 0)
                dife = dife *-1;
            if(dif == dife)
            {
                if(m1 > i)
                {
                    m1 = i;
                    m2 = i+1;
                }
            }
            if(dife > dif)
            {
                dif = dife;
                m1 = i;
                m2 = i+1;
            }

            if(numeros[i] <= numeros[i+1])
                decrescente = false;
            
            if(numeros[i] >= numeros[i+1])
                crescente = false;
        }
        for (int i = 0; i < 10; i++) {
            if(numeros[i] > x)
                maior++;
            if(numeros[i] < x)
                menor++;
            if(numeros[i] == x)
                igual++;
        }
        System.out.print(""+m1+" "+m2);
        if(!crescente && !decrescente)
                System.out.print(" Nao ordenado");
        else if(crescente)
                System.out.print(" Crescente");
        else if(decrescente)
                System.out.print(" Decrescente");

        System.out.println(" "+maior+" "+menor+" "+igual);
        sc.close();
    }
}
