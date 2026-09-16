
import java.util.Scanner;

public class score_analization
{
    public static void main(String args[])
    {
        int Scores[],Pass=0; Scores=new int[5];
        float Sum=0F,Aver=0F;

        Scanner input= new Scanner(System.in);
        for(int i=0; i<5;i++)
        {
            Scores[i]= input.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            if(Scores[i]<60)
            {
                System.out.println("第"+(i+1)+"名学生:"+Scores[i]+",不及格");
            }
            else
            {
                System.out.println("第"+(i+1)+"名学生:"+Scores[i]+",及格");
                Pass++;
            }
            Sum+=(float)Scores[i];
        }

        Aver=Sum/5;
        System.out.println("平均成绩："+Aver);
        System.out.println("及格人数："+Pass);
    }
}