package Reverser;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class ReverserTest {
    @Test
    public void testMain() {
        assertDoesNotThrow(() -> Reverser.main(new String[]{"src/main/java/Contadores/CountUp/CountUp.java"}));
    }
}