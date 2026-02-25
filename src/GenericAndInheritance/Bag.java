package GenericAndInheritance;

import java.util.ArrayList;
import java.util.List;

public class Bag<T extends Fruit>{
    private final List<T> purchase = new ArrayList<>();

    public void addFruit(T fruit){
        purchase.add(fruit);
    }

    public void printPurchase() {
        if (!purchase.isEmpty()){
            double sum = 0;
            for (T fruit : purchase){
                sum += fruit.getPrice();
            }

            System.out.println("Сумма фруктов: " + sum);
        }
        else {
            System.out.println("Ты еблан? Корзина пуста");
        }
    }
    
}

