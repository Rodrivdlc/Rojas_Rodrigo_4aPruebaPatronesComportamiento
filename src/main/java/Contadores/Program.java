package src.main.java.Contadores;

public interface Program extends Cloneable {
    void run();
    Program clone() throws CloneNotSupportedException;
}
