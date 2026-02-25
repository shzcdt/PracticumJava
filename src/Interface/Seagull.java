package Interface;

public class Seagull implements Flyable, Waterfowl, Hunter{
    @Override
    public void fly(){
        System.out.println("Парю над морем");
    }

    @Override
    public void land() {
        System.out.println("МЯгкая посадка");
    }

    @Override
    public void hunt() {
        System.out.println("Ловлю рыбу");
    }

    @Override
    public void swim() {
        System.out.println("Качаюсь на волнах");
    }

}
