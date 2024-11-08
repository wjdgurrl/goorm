package mission_3;

interface Shapes{
    double calculateDimension();
    String getName();
}

/*abstract class Shape {
    protected String name;
    public abstract double calculateDimension();
    public String getName() {
        return name;
    }
}*/

class Circle implements Shapes {
    private double radius;
    private String name;
    public Circle(double radius) {
        this.name = "원";
        this.radius = radius;
    }
    @Override
    public double calculateDimension() {
        return 3.14 * radius * radius;
    }
    @Override
    public String getName(){
        return name;
    }
}

class Square implements Shapes {
    private double length;
    private double height;
    private String name;

    public Square(double length, double height) {
        this.name = "사각형";
        this.length = length;
        this.height = height;
    }
    @Override
    public double calculateDimension() {
        return length * height;
    }
    @Override
    public String getName(){
        return name;
    }
}

class Triangle implements Shapes {
    private double line;
    private double height;
    private String name;
    public Triangle(double line, double height) {
        this.name = "삼각형";
        this.line = line;
        this.height = height;
    }
    @Override
    public double calculateDimension() {
        return 0.5 * line * height;
    }
    @Override
    public String getName(){
        return name;
    }
}

public class mission3_4{
    public static void main(String[] args) {
        Shapes[] shape = new Shapes[3];
        shape[0] = new Circle(5);
        shape[1] = new Square(5,5);
        shape[2] = new Triangle(5,3);

        for(Shapes sp : shape){
            System.out.printf("%s의 크기 : %.3f\n",sp.getName(),sp.calculateDimension());
        }

    }
}

