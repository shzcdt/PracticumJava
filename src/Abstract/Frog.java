package Abstract;

public class Frog extends Amphibian {

    protected Frog() {
        super("Зеленая");
    }

    @Override
    public void move() {
        System.out.println("Я передвигаюсь по суше прыжками");
    }
}
