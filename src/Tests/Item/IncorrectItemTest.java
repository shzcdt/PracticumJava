package Tests.Item;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IncorrectItemTest {

    @Test
    public void shouldReturnEquals() {
        Item item1 = new Item("яблочки", 50);
        Item item2 = new Item("яблочки", 50);

        assertEquals(item1, item2);
    }
}
