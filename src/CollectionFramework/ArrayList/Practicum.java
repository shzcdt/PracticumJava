package CollectionFramework.ArrayList;

import java.util.ArrayList;

public class Practicum {
    public static void main(String[] args) {
        ArrayList<String> arrayListWithDefaultCapacity = new ArrayList<>();
        ArrayList<String> arrayListWithSetCapacity = new ArrayList<>(33);

        System.out.println(arrayListWithDefaultCapacity.size());
        System.out.println(arrayListWithSetCapacity.size());
    }
}
