package lesson2.interfaces;

public interface Flyable {

    //Public methods
    String fly();

    default String action() {
        return "Fly";
    }
}
