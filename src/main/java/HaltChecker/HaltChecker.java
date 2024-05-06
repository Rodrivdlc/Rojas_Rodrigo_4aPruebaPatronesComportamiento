package src.main.java.HaltChecker;

public class HaltChecker {
    public static boolean checkForHalt(String programCode, String input) {
        // Aquí implementaremos la lógica de verificación de parada
        // Por ahora, simularemos la funcionalidad con condiciones específicas

        // Verificar si el programa es de contar hacia abajo
        if (programCode.contains("num--")) {
            return true; // El programa se detiene eventualmente
        }

        // Verificar si el programa es de contar hacia arriba
        if (programCode.contains("num++")) {
            return false; // El programa no se detiene nunca
        }

        // En otros casos, devolvemos false por defecto
        return false;
    }
}
