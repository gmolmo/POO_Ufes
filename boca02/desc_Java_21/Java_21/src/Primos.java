
import java.util.ArrayList;
import java.util.List;

public class Primos
{
    public static List<Integer> decompor_primos(int n)
    {
        List<Integer> fatores = new ArrayList<>();

        int divisor = 2;

        while(n > 1)
        {
            if(n % divisor == 0)
            {
                fatores.add(divisor);
                n = n/divisor;
            }
            else
            divisor++;
        }

        return  fatores;
    }
}