package src.main.java.HaltChecker;

import src.main.java.Contadores.Program;

public interface HaltChecker {
    boolean check(Program program);
    void setNextChecker(HaltChecker nextChecker);
}
