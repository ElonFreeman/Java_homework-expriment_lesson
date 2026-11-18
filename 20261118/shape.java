public class shape {

    interface shapeshape {

        double PI = 3.14159;

        abstract double area();

        default double perimeter() {
            return 0;
        }
    }

    class circle implements shapeshape {
        double r;

        circle(double r) {
            this.r = r;
        }

        public double area() {
            return shapeshape.PI * r * r;
        }
    }

    class rectangle implements shapeshape {
        double length, width;

        rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        public double area() {
            return 0;
        }

        public double parimeter() {
            return 2*(length + width);
        }
    }

    
    public void main(String[] args) {

        circle c = new circle(5.0);
        System.out.println(c.area());

        rectangle ra = new rectangle(10.0, 35.0);
        System.out.println(ra.parimeter());
    }

}
