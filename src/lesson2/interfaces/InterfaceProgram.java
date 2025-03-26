package lesson2.interfaces;

public class InterfaceProgram {

    public static void main(String[] args) {

        Seagull seagull = new Seagull();
        Cat cat = new Cat();
        Giraffe giraffe = new Giraffe();

        System.out.println(giraffe.action());
        System.out.println(seagull.action());
        System.out.println(cat.action());

        System.out.println(seagull.fly());
        System.out.println(seagull.walk());
        System.out.println(seagull.swim());

        System.out.println(cat.walk());
        System.out.println(cat.swim());

        System.out.println(giraffe.walk());
    }
}
