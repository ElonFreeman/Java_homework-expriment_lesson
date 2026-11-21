public class TestPerson {
    public static void main(String[] args) {
        Person p = new Person("Zhang San", "Beijing Haidian", "13800000001", "zhangsan@example.com");
        Student s = new Student("Li Si", "Shanghai Pudong", "13800000002", "lisi@example.com", "Sophomore");
        Employee e = new Employee("Wang Wu", "Guangzhou Tianhe", "13800000003", "wangwu@example.com", "Admin Building 101", 8000.0, "2020-09-01");
        Faculty f = new Faculty("Zhao Teacher", "Wuhan Hongshan", "13800000004", "zhao@example.com", "Teaching Building 305", 12000.0, "2015-09-01", "Monday Period 1-2", "Professor");
        Staff st = new Staff("Qian Clerk", "Chengdu Wuhou", "13800000005", "qian@example.com", "Office Building 202", 6000.0, "2018-03-15", "Section Chief");

        Person[] people = {p, s, e, f, st};
        for (Person person : people) {
            System.out.println(person.toString());
        }
    }
}

class Person {
    private String name;
    private String address;
    private String phone;
    private String email;

    public Person(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public String getName() { return name; }
    public String getAddress() { return address; }
    public String getPhone() { return phone; }
    public String getEmail() { return email; }

    @Override
    public String toString() {
        return "Class: Person, Name: " + name;
    }
}

class Student extends Person {
    private String gradeStatus;

    public Student(String name, String address, String phone, String email, String gradeStatus) {
        super(name, address, phone, email);
        this.gradeStatus = gradeStatus;
    }

    @Override
    public String toString() {
        return "Class: Student, Name: " + getName();
    }
}

class Employee extends Person {
    private String office;
    private double salary;
    private String hireDate;

    public Employee(String name, String address, String phone, String email,
                    String office, double salary, String hireDate) {
        super(name, address, phone, email);
        this.office = office;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Class: Employee, Name: " + getName();
    }
}

class Faculty extends Employee {
    private String classTime;
    private String title;

    public Faculty(String name, String address, String phone, String email,
                   String office, double salary, String hireDate,
                   String classTime, String title) {
        super(name, address, phone, email, office, salary, hireDate);
        this.classTime = classTime;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Class: Faculty, Name: " + getName();
    }
}

class Staff extends Employee {
    private String dutyLevel;

    public Staff(String name, String address, String phone, String email,
                 String office, double salary, String hireDate, String dutyLevel) {
        super(name, address, phone, email, office, salary, hireDate);
        this.dutyLevel = dutyLevel;
    }

    @Override
    public String toString() {
        return "Class: Staff, Name: " + getName();
    }
}