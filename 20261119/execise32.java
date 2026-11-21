public class execise32 {
    class people{
        private String name,gender;
        people(String name,String gender){
            this.name=name;
            this.gender=gender;
        }
        String showname(){
            return name;
        }
        String showgender(){
            return gender;
        }
    }
    class student extends people{
        private String stuid;
        student(String name,String gender,String stuid){
            super(name,gender);
            this.stuid=stuid;
        }
        String showstuid(){
            return stuid;
        }
    }
    class universtu extends student{
        private String study;
        universtu(String name,String gender,String stuid,String study){
            super(name,gender,stuid);
            this.study=study;
        }
        String showstudy(){
            return study;
        }
    }

    class app{
        public void main(){
            universtu unistu=new universtu("zhangsan", "male",  "202512345678",  "计算机科学与技术");
            System.out.println("name:"+unistu.showname());
            System.out.println("gender:"+unistu.showgender());
            System.out.println("id:"+unistu.showstuid());
            System.out.println("subject:"+unistu.showstudy());
        }
    }
}

    