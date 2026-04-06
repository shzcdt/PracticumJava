package Tests;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class MathsTest {

    @Test
    public void testMultiplication() {

        int factor1 = 2;
        int factor2 = 3;

        int production = factor1 * factor2;

        Assertions.assertEquals(6, production, "production value is wrong");
    }

    @Test
    public void shouldThrowException() {

        final ArithmeticException exception = assertThrows(
                ArithmeticException.class,
                () -> badDivide()
        );

        assertEquals("/ by zero", exception.getMessage());
    }

    private int badDivide() {
        return 10 / 0;
    }
}
