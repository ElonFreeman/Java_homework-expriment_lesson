import java.util.Scanner;

public class Five
{
    public static void main(String args[])    
    {
        class Matrix
        {
            int[][] arr=new int[3][3];
            int sum;

            void Diagonals()
            {
                for(int i=0;i<3;i++)
                {
                    sum+=arr[i][i];
                }
                System.out.println(sum);
                sum=0;
                for(int i=0;i<3;i++)
                {
                    sum+=arr[i][2-i];
                }
                System.out.println(sum);
                sum=0;
            }
        }

        Matrix matrix = new Matrix();
        Scanner input = new Scanner(System.in);
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                matrix.arr[i][j] = input.nextInt();
            }
        }
        matrix.Diagonals();
    }
}
