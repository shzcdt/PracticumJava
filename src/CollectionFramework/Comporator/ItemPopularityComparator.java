package CollectionFramework.Comporator;

import java.util.Comparator;

public class ItemPopularityComparator implements Comparator<Item> {

    @Override
    public int compare(Item item1, Item item2) {
        return item2.popularity - item1.popularity;
    }
}
