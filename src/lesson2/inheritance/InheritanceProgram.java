package lesson2.inheritance;

public class InheritanceProgram {

    public static void main(String[] args) {

        Polygon p1 = new Triangle(2, 4);
        System.out.println(p1.numberOfSides);
        //Dynamic polymorphism
        System.out.println(p1.area());

        Polygon p2 = new Parallelogram(10, 20);
        System.out.println(p2.numberOfSides);
        //Dynamic polymorphism
        System.out.println(p2.area());

        Polygon p3 = new Rhombus(15, 15);
        System.out.println(p3.numberOfSides);
        //Dynamic polymorphism
        System.out.println(p3.area());

        //Downcasting - Go from something general to something concrete. Typically unsafe.
        Triangle triangle = (Triangle) p1;
        //Static polymorphism
        System.out.println(triangle.area());

        //Upcasting - Go from something concrete to something general. Typically safe.
        Polygon p4 = (Polygon) triangle;
        //Dynamic polymorphism
        System.out.println(p4.area());

        //Be careful with castings!!!
        Parallelogram parallelogram = (Parallelogram) p1;
        System.out.println(parallelogram.area());

    }
}
