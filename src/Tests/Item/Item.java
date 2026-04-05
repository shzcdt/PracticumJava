package Tests.Item;

public class Item {

    private String name;
    private int value;

    public Item(String name, int value){
        this.name = name;
        this.value = value;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || object.getClass() != getClass()) return false;

        Item item = (Item) object;

        return value == item.value && name.equals(item.name);
    }
}
