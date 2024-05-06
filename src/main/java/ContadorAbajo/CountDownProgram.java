package src.main.java.ContadorAbajo;

// Programa que cuenta hacia abajo y se detiene eventualmente
public class CountDownProgram {
    public static void main(String[] args) {
        int num = 10; // Número inicial
        while (num > 0) {
            System.out.println(num);
            num--;
            try {
                Thread.sleep(1000); // Espera 1 segundo entre cada iteración (solo para demostración)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("¡El programa se ha detenido!");
    }
}
