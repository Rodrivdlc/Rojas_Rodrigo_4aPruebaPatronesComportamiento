package HaltChecker;

import static org.junit.Assert.*;
import org.junit.Test;
import java.io.IOException;

public class HaltCheckerTest {

    @Test
    public void testWillHaltForCountDown() {
        try {
            assertTrue(HaltChecker.willHalt("src/main/java/Contadores/CountDown/Countdown.java"));
        } catch (IOException e) {
            fail("IOException lanzada durante la prueba: " + e.getMessage());
        }
    }

    @Test
    public void testWillNotHaltForCountUp() {
        try {
            assertFalse(HaltChecker.willHalt("src/main/java/Contadores/CountUp/CountUp.java"));
        } catch (IOException e) {
            fail("IOException lanzada durante la prueba: " + e.getMessage());
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidFilePath() throws IOException {
        HaltChecker.willHalt("archivo/inexistente.java");
    }
}
