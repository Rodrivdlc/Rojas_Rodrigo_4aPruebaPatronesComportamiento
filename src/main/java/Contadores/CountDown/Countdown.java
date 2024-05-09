
package Contadores.CountDown;

public class Countdown {
    public static void main(String[] args) {
        int start = Integer.parseInt(args[0]);
        for (int i = start; i >= 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000); // pausa el programa por 1 segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Programa terminado.");
    }
}
