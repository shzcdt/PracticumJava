package CollectionFramework.Comporator;

import java.util.ArrayList;
import java.util.List;

public class Practicum{
    public static void main(String[] args) {

        List<Item> items = new ArrayList<>();
        items.add(new Item("Рубашка", 4500, 37));
        items.add(new Item("Носки", 55, 8));
        items.add(new Item("Толстовка", 1399, 74));
        items.add(new Item("Носки", 169, 19));

        System.out.println("До сортировки");
        System.out.println(items);

        ItemPriceComparator itemPriceComparator = new ItemPriceComparator();

        items.sort(itemPriceComparator);

        System.out.println("После сортировки: ");
        System.out.println(items);

        System.out.println("После сортировки по популярности: ");

        ItemPopularityComparator itemPopularityComparator = new ItemPopularityComparator();

        items.sort(itemPopularityComparator);

        System.out.println(items);
    }
}
