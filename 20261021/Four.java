public class Four {
    
    static class Point {
        
        double x,y;

        Point(double x,double y)
        {
            this.x=x; this.y=y;
        }

        void setPoint(double x, double y)
        {
            this.x=x; this.y=y;
        }
    }

    static class SimpleVector {

        Point apoint,bpoint;

        SimpleVector(Point a,Point b) {

            apoint=a; bpoint=b;
        }

        double length() {

            double dx=bpoint.x-apoint.x,dy=bpoint.y-apoint.y;

            return Math.sqrt(dx*dx+dy*dy);
        }

       static SimpleVector unitsv(Point p) {

            double len = Math.sqrt((p.x*p.x)+(p.y*p.y));
            double newx=p.x/len,newy=p.y/len;

            return new SimpleVector(new Point(0,0),new Point(newx, newy));
        }
    }


    
    static public class Main {
    
        public static void main(String[] args) {
        
            SimpleVector sv = new SimpleVector(new Point(0, 0),new Point(8, 6));
            System.out.println("矢量的模长为：" + sv.length());

            SimpleVector unitv = SimpleVector.unitsv(new Point(8,6));

            System.out.println("单位矢量的起点为：" + unitv.apoint.x + "," + unitv.apoint.y);
            System.out.println("单位矢量的终点为：" + unitv.bpoint.x + "," + unitv.bpoint.y);
        }
    } 
    
}
