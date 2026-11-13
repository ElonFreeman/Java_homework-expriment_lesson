package school.student;
import school.address.*;
public class student {
    
    private String name,id;
    private address address;

    public student(String name,String id,address address)
    {
        this.name = name;
        this.id = id;
        this.address = address;
    }
    public void showinfo()
    {
        System.out.println(id + ' ' + name);
        address.showaddress();
    }
}
