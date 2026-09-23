import java.util.Scanner;

public class Two
{
    class Ball
    {
        double PI=3.1415926,r=4;

        double Surface()
        {

            return 4.0*PI*r*r;
        }

        double Volume()
        {
            return (4.0/3)*PI*r*r*r;
        }
    }

    class LeapYear
    {
        int Year;

        void judgment()
        {
            if((Year%4==0 && Year%100!=0) || (Year%400==0))
            {
                System.out.printf("\u2713");
            }
            else
            {
                System.out.printf("\u2717");
            }
        }
    }

    class Temperature
    {
        double transfer(double Fahrenheit)
        {
            return (Fahrenheit-32)*5.0/9;
        }
    }

    class Binary
    {
        int Bin;

        int move(int pos)
        {
            return ((Bin >> (pos-1)) & 1);
        }
    }

    public static void main(String[] args)
    {

        Two two=new Two();
        Two.Ball ball= two.new Ball();
        System.out.println(ball.Surface());
        System.out.println(ball.Volume());

        Scanner sc=new Scanner(System.in);
        Two.LeapYear leapyear = two.new LeapYear();
        leapyear.Year=sc.nextInt();
        leapyear.judgment();

        Two.Temperature temperature = two.new Temperature();
        double Fahrenheit = sc.nextDouble();
        double Celsius = temperature.transfer(Fahrenheit);
        System.out.println(Celsius);

        Two.Binary bin = two.new Binary();
        bin.Bin=sc.nextInt();
        int pos=sc.nextInt();
        System.out.println(bin.move(pos));
    }
}