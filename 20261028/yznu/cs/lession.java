package yznu.cs;

public class lession {
    
    public String name;
    private String teacher;
    public double score;

    public lession(String name,String teacher,double score)
    {
        this.name=name;
        this.teacher=teacher;
        this.score=score;
    }

    public String getteacher()
    {
        return teacher;
    }
}
