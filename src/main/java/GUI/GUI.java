package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import HaltChecker.HaltChecker;
public class GUI {
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
        int counter = 0;
        try {
            counter = Integer.parseInt(counterTextField.getText());
            if (counter <= 0) {
                JOptionPane.showMessageDialog(frame, "El número inicial del contador debe ser mayor que 0.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (NumberFormatException exception) {
            JOptionPane.showMessageDialog(frame, "Por favor, introduce un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        boolean willHalt = false;
        try {
            willHalt = HaltChecker.willHalt("src/main/java/Contadores/" + program + "/" + program + ".java");
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        resultTextArea.setText("El programa "  + (willHalt ? " se detiene" : " no se detiene"));    }
});

        // Mostrar la ventana
        frame.setVisible(true);

        // Añadir etiqueta y botón para ejecutar el Reverse
        JLabel reverseLabel = new JLabel("Analizar con Reverse:");
        panel.add(reverseLabel);
        JButton reverseButton = new JButton("Analizar programa con Reverse");
        panel.add(reverseButton);

        // Añadir ActionListener al botón de Reverse
        reverseButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        String program = (String) programComboBox.getSelectedItem();
        try {
            boolean willHalt = HaltChecker.willHalt("src/main/java/Contadores/" + program + "/" + program + ".java");
            if (willHalt) {
                JOptionPane.showMessageDialog(frame, "El programa Reverse ha entrado en un bucle infinito.", "Información", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(frame, "El programa Reverse se ha detenido.", "Información", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
});
    }
}