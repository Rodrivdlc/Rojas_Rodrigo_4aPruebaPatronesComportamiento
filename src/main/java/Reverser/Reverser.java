package src.main.java.Reverser;

import src.main.java.HaltChecker.HaltChecker;

public class Reverser {
    public static void main(String[] args) {
        // Supongamos que tenemos un programa de contar hacia abajo
        String programCode = "public class CountDownProgram { public static void main(String[] args) { int num = 10; while (num > 0) { System.out.println(num); num--; try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); } } System.out.println(\"¡El programa se ha detenido!\"); } }";

        // Verificar si el programa se detiene
        boolean halt = HaltChecker.checkForHalt(programCode, "");

        // Ejecutar Reverser según la salida de HaltChecker
        if (halt) {
            // Entrar en un bucle infinito
            while (true) {
                // No hacemos nada, solo iteramos infinitamente
            }
        } else {
            // Terminar inmediatamente
            return;
        }
    }
}
