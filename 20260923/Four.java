public class Four
{
    public static void main(String[] args)
    {
        class TempTransfer
        {
            void transfer()
            {
                System.out.println("Celsius  Fahrenheit");
                for(double Celsius=0;Celsius<=100;Celsius++)
                {
                    double Fahrenheit = Celsius*1.8+32.0;
                    System.out.printf("%.2f      %.2f\n",Celsius,Fahrenheit);
                }
            }
        }

        TempTransfer temptrans = new TempTransfer();
        temptrans.transfer();
    }    
}
