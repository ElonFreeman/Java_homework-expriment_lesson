package school;
import school.student.*;
import school.address.*;
public class main {
    
    public void main(String args[])
    {
        address address = new address("getan","joker");
        student student = new student("jack","011",address);

        student.showinfo();
    }
}
