package src.main.java.Contadores.CountDown;

import src.main.java.Contadores.Program;

public class CountDownProgram implements Program {
    @Override
    public void run() {
        int num = 10;
        while (num > 0) {
            System.out.println(num);
            num--;
        }
    }

    @Override
    public Program clone() throws CloneNotSupportedException {
        return (Program) super.clone();
    }
}
