package Contadores.CountUp;


public class CountUp {
    public static void main(String[] args) {
        long start = Long.parseLong(args[0]);
        for (long i = start; ; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000); // pausa el programa por 1 segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}