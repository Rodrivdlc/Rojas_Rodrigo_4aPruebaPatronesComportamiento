package HaltChecker;

import java.nio.file.*;
import java.io.IOException;
import java.util.regex.*;

public class HaltChecker {
    public static boolean willHalt(String filePath) throws IOException {
        String code = new String(Files.readAllBytes(Paths.get(filePath)));

        Pattern pattern = Pattern.compile("for.*\\(.*;.*;.*\\)");
        Matcher matcher = pattern.matcher(code);

        if (matcher.find()) {
            String loop = matcher.group();
            if (loop.contains("i++")) {
                return false;
            } else if (loop.contains("i--")) {
                return true;
            }
        }

        throw new IllegalArgumentException("No se pudo determinar el comportamiento del programa.");
    }

    public static void main(String[] args) {
        try {
            System.out.println(willHalt("src/main/java/Contadores/CountDown/Countdown.java"));
            System.out.println(willHalt("src/main/java/Contadores/CountUp/CountUp.java"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}