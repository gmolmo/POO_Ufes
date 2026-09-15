import java.util.HashMap;
import java.util.Scanner;

public class Java_19 { 
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        HashMap<String,String> dicionario = new HashMap<>();


        while(true)
        {
            String line = sc.nextLine();

            if(line.charAt(0)=='.')
                break;

            String[] partes = line.split("=", 2);
            String termo = partes[0].trim();
            String traducao = partes[1].trim();

            dicionario.put(termo,traducao);
        }

        while(true)
        {
            String line = sc.nextLine();

            if(line.charAt(0)=='.')
                break;

            if(dicionario.containsKey(line))
            {
                System.out.println(dicionario.get(line));
            }
            else
            {
                System.out.println("Termo nao encontrado: " + line);
            }
        }
    
        sc.close();
    }
}

