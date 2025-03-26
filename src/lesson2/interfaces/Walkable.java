package lesson2.interfaces;

public interface Walkable {

    //Public methods
    String walk();

    default String action() {
        return "Walk";
    }
}
