package Reverser;

import HaltChecker.HaltChecker;
import java.io.IOException;

public class Reverser {
    public static void main(String[] args) {
        String programPath = args[0];

        try {
            boolean willHalt = HaltChecker.willHalt(programPath);

            if (willHalt) {
                // Si HaltChecker devuelve true, entramos en un bucle infinito
                while (true) {
                }
            } else {
                // Si HaltChecker devuelve false, terminamos el programa inmediatamente
                System.exit(0);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}