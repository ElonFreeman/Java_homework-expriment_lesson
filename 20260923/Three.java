
import java.util.Scanner;

public class Three 
{
    class maximum
    {
        int a,b,c;

        void judgment()
        {
            if(a>b)
            {
                if(a>c)
                {
                    System.out.println(a);
                }
                else if(a<=c)
                {
                    System.out.println(c);
                }
            }
            else if(a<=b)
            {
                if(b>c)
                {
                    System.out.println(b);
                }
                else if(b<=c)
                {
                    System.out.println(c);
                }
            }
        }
    }
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        Three three = new Three();
        Three.maximum max = three.new maximum();
        max.a=input.nextInt();
        max.b=input.nextInt();
        max.c=input.nextInt();
        max.judgment();

        input.close();
    }    
}
