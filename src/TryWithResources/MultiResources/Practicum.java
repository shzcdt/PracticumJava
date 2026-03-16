package TryWithResources.MultiResources;

public class Practicum {
    public static void main(String[] args) {
        try (Resource1 resource1 = new Resource1(); Resource2 resource2 = new Resource2()){
            System.out.println("нутри блока try");
        }
    }
}

class Resource1 implements AutoCloseable {

    @Override
    public void close() {
        System.out.println("метод close() для resources1");
    }
}

class Resource2 implements AutoCloseable {

    @Override
    public void close() {
        System.out.println("метод close() для resources2");
    }
}
