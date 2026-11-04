import static java.lang.Math.*;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class timemath{

    public static  void main(String args[])
    {
        System.out.println("绝对值 abs(-9.8) = " + abs(-9.8));
        System.out.println("随机数 random() [0,1) = " + random());
        System.out.println("四舍五入 round(2.68) = " + round(2.68));
        System.out.println("最大值 max(10,20) = " + max(10, 20));
        System.out.println("2的3次幂 pow(2,3) = " + pow(2, 3));
        
        System.out.println();

        System.out.println("当前日期："+LocalDate.now());
        System.out.println("当前时间："+LocalTime.now());
        System.out.println("当前日期+时间："+LocalDateTime.now());

        LocalDate currentdate = LocalDate.now();
        System.out.println("年份：" + currentdate.getYear());
        System.out.println("月份：" + currentdate.getMonthValue());
        System.out.println("日期：" + currentdate.getDayOfMonth());

        System.out.println();

        long startTime = System.currentTimeMillis();
        
        // 模拟一个耗时操作：执行一百万次累加
        long sum = 0;
        for (int i = 0; i < 1000000; i++) {
            sum += i;
        }
        
        long endTime = System.currentTimeMillis();
        
        // [4] 输出执行耗时
        System.out.println("执行一百万次累加的耗时（毫秒）是：" + (endTime - startTime));
    }
}