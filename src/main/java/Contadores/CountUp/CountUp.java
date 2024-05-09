package Contadores.CountUp;

public class CountUp {
    public static void main(String[] args) {
        for (long i = 0; ; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000); // pausa el programa por 1 segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
