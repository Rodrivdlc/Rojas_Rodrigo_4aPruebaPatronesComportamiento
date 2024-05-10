package HaltChecker;

import java.nio.file.*;
import java.io.IOException;
import java.util.regex.*;
//para determinar si el programa se detendrá el bucle para ver si es creciente o decreciente
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
}