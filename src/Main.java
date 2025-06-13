class Shape {
    double area() {
        return 0;
    }
}

class Circle extends Shape {
    double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        return r * r * 3.14;
    }
}

class Rectangle extends Shape {
    double w;
    double h;

    public Rectangle(double w, double h) {
        this.w = w;
        this.h = h;
    }

    @Override
    public double area() {
        return w * h;
    }
}

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];

        shapes[0] = new Circle(3);
        shapes[1] = new Rectangle(4, 5);

        for(Shape shape : shapes) {
            System.out.println(shape.area());
        }



    }
}