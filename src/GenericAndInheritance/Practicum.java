package GenericAndInheritance;

public class Practicum{
    public static void main(String[] args) {
        Bag<Apple> bag = new Bag<>();
            bag.addFruit(new Apple());
        bag.printPurchase();
    }
}
