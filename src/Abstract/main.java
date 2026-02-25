package Abstract;

public class main {
    public static void main(String[] args) {
        Frog frog = new Frog();
        System.out.println("Привет! Я - зеленая лягушка.");
        frog.move();
        System.out.println(frog.getColor());;

        Toad toad = new Toad();
        System.out.println("Привет! Я - коричневая жаба");
        System.out.println(toad.getColor());
        toad.move();
    }
}
