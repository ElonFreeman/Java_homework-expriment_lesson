
import java.util.Scanner;

public class Six
{
    public static void main(String[] args)
    {
        class CombNum
        {
            long n,k;
            long re1=1,re2=1,re3=1;

            void calculate()
            {
                for(long i=1;i<=n;i++)
                {
                    re1*=i;
                }
                for(long i=1;i<=k;i++)
                {
                    re2*=i;
                }
                for(long i=1;i<=n-k;i++)
                {
                    re3*=i;
                }

                System.out.println(re1/(re2*re3));
            }
        }

        Scanner input = new Scanner(System.in);
        CombNum combnum = new CombNum();
        combnum.n=input.nextLong();
        combnum.k=input.nextLong();
        combnum.calculate();
        input.close();
    }    
}
