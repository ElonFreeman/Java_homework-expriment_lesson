public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("zhangming");
        s1.showName();
        Student s2 = new Student("lihua");
        s2.showName();
        Student s3 = new Student("wangfang");
        s3.showName();
        System.out.println("current_number" + Student.getCount());
    }
}

class Student {
    private String name;
    private static int count = 0;

    public Student(String name) {
        this.name = name;
        count++;
    }

    public void showName() {
        System.out.println(name);
    }

    public static int getCount() {
        return count;
    }
}
