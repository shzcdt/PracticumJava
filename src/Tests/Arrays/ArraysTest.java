package Tests.Arrays;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ArraysTest {

    @Test
    public void arraysShouldBeEquals() {
        String[] arrayOne = new String[] {"hello", "world"};
        String[] arrayTwo = new String[] {"hello", "world"};

        assertArrayEquals(arrayOne, arrayTwo);
    }
}
