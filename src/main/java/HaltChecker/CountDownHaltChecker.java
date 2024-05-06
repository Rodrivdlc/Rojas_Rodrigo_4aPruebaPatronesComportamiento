package src.main.java.HaltChecker;

import src.main.java.Contadores.CountDown.CountDownProgram;
import src.main.java.Contadores.Program;

public class CountDownHaltChecker implements HaltChecker {
    private HaltChecker nextChecker;

    @Override
    public boolean check(Program program) {
        if (program instanceof CountDownProgram) {
            return true;
        } else if (nextChecker != null) {
            return nextChecker.check(program);
        }
        return false;
    }

    @Override
    public void setNextChecker(HaltChecker nextChecker) {
        this.nextChecker = nextChecker;
    }
}
