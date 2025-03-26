package lesson2.inheritance;

public class Parallelogram extends Polygon {

    private double base;
    private double height;

    public Parallelogram(double base, double height) {
        super(4);
        this.base = base;
        this.height = height;
    }

    @Override
    protected double area() {
        System.out.println("Calculating Parallelogram area...");
        return base * height;
    }

    @Override
    public String toString() {
        return super.toString() + "Parallelogram";
    }
}
