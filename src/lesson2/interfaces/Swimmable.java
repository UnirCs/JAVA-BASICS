package lesson2.interfaces;

public interface Swimmable {

    //Public methods
    String swim();

    default String action() {
        return "Swim";
    }
}
