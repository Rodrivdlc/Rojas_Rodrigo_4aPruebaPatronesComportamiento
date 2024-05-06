package src.main.java;

import src.main.java.Contadores.CountDown.CountDownProgram;
import src.main.java.Contadores.CountUp.CountUpProgram;
import src.main.java.Contadores.Program;
import src.main.java.HaltChecker.CountDownHaltChecker;
import src.main.java.HaltChecker.CountUpHaltChecker;
import src.main.java.HaltChecker.HaltChecker;
import src.main.java.Reverser.Reverser;
x xx
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Program countUpProgram = new CountUpProgram();
        Program countDownProgram = new CountDownProgram();

        HaltChecker countUpHaltChecker = new CountUpHaltChecker();
        HaltChecker countDownHaltChecker = new CountDownHaltChecker();
        countUpHaltChecker.setNextChecker(countDownHaltChecker);

        Reverser reverser = new Reverser(countUpHaltChecker);
        reverser.run(countUpProgram);
        reverser.run(countDownProgram);
    }
}
