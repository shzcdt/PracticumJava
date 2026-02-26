package CollectionFramework.Comporator;

import java.util.Comparator;

public class ItemPriceComparator implements Comparator<Item> {

    @Override
    public int compare(Item item1, Item item2) {
        return Integer.compare(item1.price, item2.price);
    }
}

