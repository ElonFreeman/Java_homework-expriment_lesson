public class Circle {

    static class circle{

        double radius;
        static int numberofobj;
        circle()
        {
            numberofobj++;
        }

        circle(double radius)
        {
            this.radius=radius;
            this();
        }

        double getradius()
        {
            return radius;
        }

        void setradius (double radius)
        {
            this.radius=radius;
            numberofobj++;
        }

        double getarea()
        {
            return radius*radius*3.14;
        }

        double getcircumference()
        {
            return 2*radius*3.14;
        }

        int getNumberofobj()
        {
            return numberofobj;
        }
    }

    public static void main(String[] args) {
        
        

        circle[] arr = new circle[4];
        for(int i=0;i<4;i++)
        {
            arr[i] = new circle((double)i+1.0);
        }

        System.out.println("创建的对象数量为：" + circle.numberofobj);
        for(int i=0;i<4;i++)
        {
            System.out.println("半径为" + (i+1) + "的圆周长是" + arr[i].getcircumference() + "," + "面积是" + arr[i].getarea());
        }
        
    }
    
}
