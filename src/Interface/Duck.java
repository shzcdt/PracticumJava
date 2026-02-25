package Interface;

public class Duck implements Flyable, Waterfowl{
    @Override
    public void fly() {
        System.out.println("Летаю и крякаю");
    }

    @Override
    public void swim() {
        System.out.println("Плаваю за хлебушком");
    }

    @Override
    public void land() {
        System.out.println("Приземляюсь на лапки");
    }
}
