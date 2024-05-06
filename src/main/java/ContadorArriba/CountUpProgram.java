package src.main.java.ContadorArriba;

// Programa que cuenta hacia arriba y no se detiene nunca
public class CountUpProgram {
    public static void main(String[] args) {
        int num = 1; // Número inicial
        while (true) {
            System.out.println(num);
            num++;
            try {
                Thread.sleep(1000); // Espera 1 segundo entre cada iteración (solo para demostración)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
