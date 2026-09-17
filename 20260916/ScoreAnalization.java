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