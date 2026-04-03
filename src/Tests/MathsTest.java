package Tests;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MathsTest {

    @Test
    public void testMultiplication() {

        int factor1 = 2;
        int factor2 = 3;

        int production = factor1 * factor2;

        Assertions.assertEquals(6, production, "production value is wrong");
    }
}
