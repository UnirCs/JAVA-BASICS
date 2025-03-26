package lesson2.inheritance;

public class Rhombus extends Polygon {

    private double bigDiag;
    private double smallDiag;

    public Rhombus(double bigDiag, double smallDiag) {
        super(4);
        this.bigDiag = bigDiag;
        this.smallDiag = smallDiag;
    }

    @Override
    protected double area() {
        System.out.println("Calculating Rhombus area...");
        return bigDiag * smallDiag / 2;
    }

    @Override
    public String toString() {
        return super.toString() + "Rhombus";
    }
}