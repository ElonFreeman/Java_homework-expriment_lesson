 import java.util.Scanner;

public class ScoreAnalization {
    public static void main(String args[]) {
        // 定义长度为5的int数组保存成绩，初始化及格人数、总分和平均成绩
        int[] scores = new int[5];
        int pass = 0;
        double sum = 0;
        double aver = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("请依次输入5名学生的Java成绩：");
        for(int i = 0; i < 5; i++) {
            scores[i] = input.nextInt();
        }

        // 遍历输出每个学生成绩与及格情况，统计总分和及格人数
        for(int i = 0; i < 5; i++) {
            int studentNo = i + 1;
            if(scores[i] < 60) {
                System.out.printf("第%d名学生：%d分，不及格%n", studentNo, scores[i]);
            } else {
                System.out.printf("第%d名学生：%d分，及格%n", studentNo, scores[i]);
                pass++;
            }
            sum += scores[i];
        }

        aver = sum / 5;
        System.out.printf("平均成绩：%.1f%n", aver);
        System.out.println("及格人数：" + pass);
        input.close();
    }
}

/*
import java.util.Scanner;

public class ScoreAnalization
{
	public static void main(String args[])
	{
		// 定义长度为5的int数组保存成绩
		int[] scores=new int[5];
		int pass=0;
		double sum=0,aver=0;
		
		Scanner input=new Scanner(System.in);
		System.out.println("请输入5名学生的成绩：");
		// 循环输入5名学生成绩
		for(int i=0;i<5;i++)
		{
			scores[i]=input.nextInt();
		}
		
		// 遍历成绩，进行判断输出，同时统计总分和及格人数
		for(int i=0;i<5;i++)
		{
			if(scores[i]<60)
			{
				System.out.printf("第%d名学生：%d分，不及格%n",i+1,scores[i]);
			}
			else
			{
				System.out.printf("第%d名学生：%d分，及格%n",i+1,scores[i]);
				pass++;
			}
			sum+=scores[i];
		}
		
		// 计算并输出平均成绩
		aver=sum/5;
		System.out.printf("平均成绩：%.1f%n",aver);
		System.out.println("及格人数："+pass);
		input.close();
	}
}
*/

/*
Code Review
Total score：77 Score
功能实现：25 Score
Code location:第32行
Existing issues:平均成绩输出格式错误，使用了`%1f`格式符，会导致输出结果不符合要求，其他核心功能均已正确实现
Suggestions:将格式符修改为`%.1f`，控制小数输出位数，满足示例输出要求
代码质量：27 Score
Code location:整个代码文件（第1行至第36行）
Existing issues:代码存在一处格式不规范，输出语句中冒号后缺少一个空格，和示例输出格式不一致；除此之外整体语法正确、结构清晰，注释合理，无无效逻辑
Suggestions:将输出学生信息的格式化字符串中，冒号后补充一个空格，保持和要求输出格式一致
问题考虑完整性：15 Score
Code location:整个代码文件
Existing issues:没有添加防御性处理，未对输入非整数、输入成绩超出0-100合理范围的异常情况进行处理
Suggestions:增加输入校验逻辑，判断输入是否为合法整数，以及成绩是否在合理区间，非法输入时给出提示并要求重新输入，提升程序健壮性
创新与优化：10 Score
Code location:整个代码文件
Existing issues:功能实现满足基础需求，但是可复用性不足，没有对功能进行拆分封装，如果后续修改学生人数会需要改动多处代码
Suggestions:可以将成绩输入、结果统计输出封装为独立方法，将数组长度定义为常量，提升代码的可维护性和可复用性
Code guidance
Revised code
 import java.util.Scanner;

public class ScoreAnalization
{
	public static void main(String args[])
	{
		//定义长度为5的int数组保存成绩
		int[] scores=new int[5];
		int pass=0;
		double sum=0,aver=0;
		
		Scanner input=new Scanner(System.in);
		System.out.println("请输入五名学生的成绩:");
		//循环输入五名学生的成绩
		for(int i=0;i<5;i++)
		{
			scores[i]=input.nextInt();
		}
		
		//遍历成绩,进行判断输出,同时统计总分和及格人数
		for(int i=0;i<5;i++)
		{
			if(scores[i]<60)
			{
				System.out.printf("第%d名学生：%d分，不及格%n",i+1,scores[i]);
			}
			else
			{
				System.out.printf("第%d名学生：%d分，及格%n",i+1,scores[i]);
				pass++;
			}
			sum+=scores[i];
		}
		
		//计算与输出平均成绩
		aver=sum/5;
		System.out.printf("平均成绩：%.1f%n",aver);
		System.out.println("及格人数："+pass);
		input.close();
	}
}
Explanation of key modification:
1.修正平均成绩的格式符，将`%1f`改为`%.1f`，输出正确的小数结果
2.调整输出字符串的格式，补充空格，和题目要求的输出格式保持一致
*/