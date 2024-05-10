package HaltChecker;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class HaltCheckerTest {
    @Test
    public void testWillHaltForCountDown() {
        assertDoesNotThrow(() -> assertTrue(HaltChecker.willHalt("src/main/java/Contadores/CountDown/Countdown.java")));
    }

    @Test
    public void testWillNotHaltForCountUp() {
        assertDoesNotThrow(() -> assertFalse(HaltChecker.willHalt("src/main/java/Contadores/CountUp/CountUp.java")));
    }

    @Test
    public void testInvalidFilePath() {
        assertThrows(IOException.class, () -> HaltChecker.willHalt("archivo/inexistente.java"));
    }
}
