package Static;

public class Bird {

    private static int count = 0;

    Bird() {
        count++;
        System.out.println("Колличество созданных объектов: " + count);
    }
}
