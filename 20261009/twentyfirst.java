public class twentyfirst
{
    public static void main(String args[])    
    {
        class Student
        {
            String name;
            double score;

            Student(String name,double score)
            {
                this.name=name;
                this.score=score;
            }

            void showinfo()
            {
                System.out.println("姓名：" + name + "，成绩：" + score);
            }
        }

        Student zhangsan = new Student("zhangsan",85.5);
        Student lisi = new Student("lisi",92.0);

        zhangsan.showinfo(); lisi.showinfo();

        System.out.println("平均成绩：" + ((zhangsan.score+lisi.score)/2));
    }
}
