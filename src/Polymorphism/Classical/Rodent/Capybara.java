package Polymorphism.Classical.Rodent;

public class Capybara implements Rodent {

    @Override
    public void crunch() {
        System.out.println("Капибара любит грызть кукурузу");
    }

    @Override
    public void sleep() {
        System.out.println("Капибара любит крепко спать");
    }

    public void dive() {
        System.out.println("Капибара умеет нырять");
    }
}

