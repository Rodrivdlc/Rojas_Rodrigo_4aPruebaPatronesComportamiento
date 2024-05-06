package src.main.java.Contadores.CountUp;

import src.main.java.Contadores.Program;

public class CountUpProgram implements Program {
    @Override
    public void run() {
        int num = 1;
        while (true) {
            System.out.println(num);
            num++;
        }
    }

    @Override
    public Program clone() throws CloneNotSupportedException {
        return (Program) super.clone();
    }
}

