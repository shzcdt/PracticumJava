package Polymorphism.ad_hoc;

public class Practicum{
    public static void main(String[] args) {
        Actor actor = new Actor();
        Actor hamlet = new Hamlet();
        actor.play();
        hamlet.play();
    }
}
