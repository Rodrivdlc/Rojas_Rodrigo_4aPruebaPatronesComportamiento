package src.main.java.HaltChecker;

import src.main.java.Contadores.Program;
import src.main.java.Contadores.CountUp.CountUpProgram;

public class CountUpHaltChecker implements HaltChecker {
    private HaltChecker nextChecker;

    @Override
    public boolean check(Program program) {
        if (program instanceof CountUpProgram) {
            return false;
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

