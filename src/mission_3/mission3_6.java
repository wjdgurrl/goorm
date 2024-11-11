package mission_3;

interface ShapeInterface{
    double calculate();
}

abstract class AbstractShape{
    private String name;
    private double width;
    private double height;

    public abstract double calculateDimension();
    public String getName(){
        return name;
    }
}
class Circle2 extends AbstractShape implements ShapeInterface{
    private double radius;

    public Circle2(double radius){
        this.radius = radius;
    }
    @Override
    public double calculateDimension(){
        return 3.14 * radius * radius;
    }

    @Override
    public double calculate() {
        return calculateDimension();
    }
}

// TODO: 2024-11-11
// 이어 해야함
public class mission3_6 {
}
