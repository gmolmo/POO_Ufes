public class App {
    public static void main(String[] args) throws Exception {
        double s1 = 0.0, s2 = 0.0, s3 = 1.0;

        double k = 1.0;
        int j = 50;

        for(double i = 1.0; i <= 99; i+=2, k++,j--)
        {   
            s1 += (i/k);
            s2 += (Math.pow(2, k))/j;
        }

        for(double i = 2.0; i <= 10; i++)
        {
            if(i%2 == 0)//par
                s3 -= (i/(Math.pow(i, 2)));
            else
                s3 += (i/(Math.pow(i, 2)));
        }


        System.out.println("S1 = "+s1);
        System.out.println("S2 = "+s2);
        System.out.println("S3 = "+s3);
    }
}
