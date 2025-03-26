package lesson2.inheritance;

public class Triangle extends Polygon {

    private double base;
    private double height;

    public Triangle(double base, double height) {
        super(3);
        this.base = base;
        this.height = height;
    }

    @Override
    protected double area() {
        System.out.println("Calculating Triangle area...");
        return (base * height) / 2;
    }

    @Override
    public String toString() {
        return super.toString() + "Triangle";
    }
}
