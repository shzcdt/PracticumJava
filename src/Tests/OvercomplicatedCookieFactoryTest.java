package Tests;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import java.util.Collections;

public class OvercomplicatedCookieFactoryTest {
    private static OvercomplicatedCoolieFactory cookieFactory;
    @BeforeEach
    public void beforeEach() {
        cookieFactory = new OvercomplicatedCoolieFactory(
                Collections.singletonList("Вам повезет!"),
                Collections.singletonList("Сегодня будет дождь"),
                true
        );
    }

    @Test
    public void shouldReturnsPositiveCookie() {
        String cookieText = cookieFactory.bakeFortuneCookie();
        Assertions.assertEquals("Вам повезет!", cookieText);
    }
}
