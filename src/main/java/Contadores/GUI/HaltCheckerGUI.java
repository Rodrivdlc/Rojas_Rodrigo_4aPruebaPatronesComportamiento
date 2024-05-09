package Contadores.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import HaltChecker.HaltChecker;
public class HaltCheckerGUI {
    public static void main(String[] args) {
        // Crear la ventana principal
        JFrame frame = new JFrame("Halt Checker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // Crear el panel principal
        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setLayout(new GridLayout(5, 2));

        // Añadir etiqueta y combo box para seleccionar el programa
        JLabel programLabel = new JLabel("Selecciona el programa:");
        panel.add(programLabel);
        String[] programs = {"Countdown", "CountUp"};
        JComboBox<String> programComboBox = new JComboBox<>(programs);
        panel.add(programComboBox);

        // Añadir etiqueta y campo de texto para ingresar el número inicial del contador
        JLabel counterLabel = new JLabel("Ingresa el número inicial del contador:");
        panel.add(counterLabel);
        JTextField counterTextField = new JTextField();
        panel.add(counterTextField);

        // Añadir botón para ejecutar el HaltChecker
        JButton checkButton = new JButton("Analizar programa");
        panel.add(checkButton);

        // Añadir área de texto para mostrar el resultado
        JTextArea resultTextArea = new JTextArea();
        panel.add(resultTextArea);

        // Añadir ActionListener al botón
        checkButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        String program = (String) programComboBox.getSelectedItem();
        boolean willHalt = false;
        try {
            willHalt = HaltChecker.willHalt("src/main/java/Contadores/" + program + "/" + program + ".java");
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        resultTextArea.setText("El programa " + program + " se detendrá: " + willHalt);
        }
});

        // Mostrar la ventana
        frame.setVisible(true);
    }
}