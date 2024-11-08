/*
package mission_3;

abstract class Shape {
    protected String name;
    public abstract double calculateDimension();
    public String getName() {
        return name;
    }
}

class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
        this.name = "원";
        this.radius = radius;
    }
    @Override
    public double calculateDimension() {
        return 3.14 * radius * radius;
    }
}

class Square extends Shape {
    private double length;
    private double height;
    public Square(double length, double height) {
        this.name = "사각형";
        this.length = length;
        this.height = height;
    }
    @Override
    public double calculateDimension() {
        return length * height;
    }
}

class Triangle extends Shape {
    private double line;
    private double height;
    public Triangle(double line, double height) {
        this.name = "삼각형";
        this.line = line;
        this.height = height;
    }
    @Override
    public double calculateDimension() {
        return 0.5 * line * height;
    }
}

public class mission3_3{
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Circle(5);
        shape[1] = new Square(5,5);
        shape[2] = new Triangle(5,3);

        for(Shape sp : shape){
            System.out.printf("%s의 크기 : %.3f\n",sp.getName(),sp.calculateDimension());
        }

    }
}

*/
