package lesson2.inheritance;

//Abstract modifier - This class cannot be instantiated
public abstract class Polygon {

    //Protected variable - visible only in this class and sub-classes of this one.
    protected int numberOfSides;

    //Abstract method. It MUST be implemented in every sub-class of this one.
    protected abstract double area();

    public String toString() {
        return "Polygon: ";
    }

    public Polygon(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }
}
