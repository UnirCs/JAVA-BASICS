package lesson2.interfaces;

public class Seagull implements Walkable, Swimmable, Flyable {


    @Override
    public String fly() {
        return "Seagull flying...";
    }

    @Override
    public String swim() {
        return "SeaGull swimming...";
    }

    @Override
    public String walk() {
        return "SeaGull walking...";
    }

    @Override
    public String action() {
        return "Seagulls can Swim & Fly & Walk";
    }
}
