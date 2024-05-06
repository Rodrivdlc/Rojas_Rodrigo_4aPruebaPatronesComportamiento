package src.main.java.Reverser;

import src.main.java.Contadores.Program;
import src.main.java.HaltChecker.HaltChecker;

public class Reverser {
    private HaltChecker haltChecker;

    public Reverser(HaltChecker haltChecker) {
        this.haltChecker = haltChecker;
    }

    public void run(Program program) throws CloneNotSupportedException {
        Program clonedProgram = program.clone();
        if (haltChecker.check(clonedProgram)) {
            while (true) {}
        }
    }
}
