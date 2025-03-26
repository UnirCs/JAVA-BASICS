package lesson2.interfaces;

public class Cat implements Walkable, Swimmable {

    @Override
    public String swim() {
        return "Cat swimming...";
    }

    @Override
    public String walk() {
        return "Cat walking...";
    }

    @Override
    public String action() {
        return "Cats can Swim & Walk";
    }
}
