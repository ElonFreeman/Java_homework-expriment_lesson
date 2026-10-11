public class twentysecond
{
    public static void main(String[] args)
    {
        class Student
        {
            String name;
            double score;

            static int count=0;

            Student(String name,double score)
            {
                this.name=name;
                this.score=score;
                count++;
            }

            void showinfo()
            {
                System.out.println("姓名：" + name + "，成绩：" + score);
            }

            void changescore(double score)
            {
                this.score=score;
            }
        }

        Student s1 = new Student("zhangsan", 80);
        Student s2 = new Student("lisi",90);

        s1.showinfo(); s2.showinfo();

        Student s3=s1;
        s3.changescore(95);
        System.out.println("s1的成绩：" + s1.score);
        System.out.println("s3的成绩：" + s3.score);

        System.out.println("学生对象个数：" + Student.count);
    }    
}
