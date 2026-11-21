// Geometry.java
public interface Geometry {
    double getArea();
}

// Circle.java
public class Circle implements Geometry {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

// Rectangle.java
public class Rectangle implements Geometry {
    public double width;
    public double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}

// Triangle.java
public class Triangle implements Geometry {
    public double aLine;
    public double bLine;
    public double cLine;

    public Triangle(double aLine, double bLine, double cLine) {
        this.aLine = aLine;
        this.bLine = bLine;
        this.cLine = cLine;
    }

    public double getHeight(double lineAny) {
        return 0;
    }

    @Override
    public double getArea() {
        double p = (aLine + bLine + cLine) / 2;
        return Math.sqrt(p * (p - aLine) * (p - bLine) * (p - cLine));
    }

    public static Triangle getInstance(double aLine, double bLine, double cLine) {
        return new Triangle(aLine, bLine, cLine);
    }
}

// Pillar.java
public class Pillar {
    Geometry bottom;
    double height;

    public Pillar(Geometry bottom, double height) {
        this.bottom = bottom;
        this.height = height;
    }

    public double getVolume() {
        return bottom.getArea() * height;
    }
}

// Application.java
public class Application {
    public static void main(String[] args) {
        Geometry triangle = new Triangle(3, 4, 5);
        Pillar pillar = new Pillar(triangle, 10);
        System.out.println("getVolume" + pillar.getVolume());
    }
}
