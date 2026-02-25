package Interface;

public class Cat implements Pet, Mammal {
    @Override
    public int getPawsCount() {
        return 4;
    }

    @Override
    public void eat() {
        System.out.println("Люблю покушать рыбку");
    }

    @Override
    public void giveMilk() {
        System.out.println("Кормлю котят молоком");
    }

    @Override
    public void play() {
        System.out.println("Играю с клубком");
    }

    @Override
    public void makeNoise() {
        System.out.println("Мяу!");
    }
}
