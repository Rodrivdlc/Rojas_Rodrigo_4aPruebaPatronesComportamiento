package HaltChecker;

import java.nio.file.*;
import java.io.IOException;
import java.util.regex.*;
//para determinar si el programa se detendrá el bucle para ver si es creciente o decreciente
public class HaltChecker {
    /**
     * Determina si el programa especificado por la ruta del archivo se detendrá o no.
     *
     * Este método lee el código del archivo, busca un bucle `for` y determina si el bucle es creciente o decreciente.
     * Si el bucle es creciente (es decir, contiene "i++"), el método devuelve `false`.
     * Si el bucle es decreciente (es decir, contiene "i--"), el método devuelve `true`.
     * Si no se puede determinar el comportamiento del bucle, el método lanza una excepción `IllegalArgumentException`.
     *
     * @param filePath La ruta del archivo que contiene el código del programa a analizar.
     * @return `true` si el programa se detendrá, `false` si no se detendrá.
     * @throws IOException Si ocurre un error al leer el archivo.
     * @throws IllegalArgumentException Si no se puede determinar el comportamiento del programa.
     */
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