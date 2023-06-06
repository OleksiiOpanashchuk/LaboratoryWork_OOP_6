class Shape {
    protected double volume;

    public double getVolume() {
        return volume;
    }
}

class SolidOfRevolution extends Shape {
    protected double radius;

    public double getRadius() {
        return radius;
    }
}

class Ball extends SolidOfRevolution {
    // Конструктор
    public Ball(double radius) {
        this.radius = radius;
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}

class Cylinder extends SolidOfRevolution {
    private double height;

    // Конструктор
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
        volume = Math.PI * Math.pow(radius, 2) * height;
    }
}

class Pyramid extends Shape {
    private double s;
    private double h;

    // Конструктор
    public Pyramid(double s, double h) {
        this.s = s;
        this.h = h;
        volume = (1.0 / 3.0) * s * h;
    }
}

public class Hierarchy {
    public static void main(String[] args) {
        Ball ball = new Ball(5.0);
        Cylinder cylinder = new Cylinder(3.0, 10.0);
        Pyramid pyramid = new Pyramid(20.0, 15.0);

        System.out.println("Ball radius: " + ball.getRadius());
        System.out.println("Ball volume: " + ball.getVolume());

        System.out.println("Cylinder radius: " + cylinder.getRadius());
        System.out.println("Cylinder volume: " + cylinder.getVolume());

        System.out.println("Pyramid volume: " + pyramid.getVolume());
    }
}