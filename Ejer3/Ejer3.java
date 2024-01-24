package Ejer3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejer3 {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            crearVentanaPrincipal();
        });
    }

    private static void crearVentanaPrincipal() {
        JFrame ventana = new JFrame("Mi Aplicación");
        ventana.setSize(400, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));

        // Label
        JLabel label = new JLabel("Etiqueta:");
        panel.add(label);

        // Button
        JButton button = new JButton("Botón");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(ventana, "Has hecho clic en el botón.");
            }
        });
        panel.add(button);

        // CheckBox
        JCheckBox checkBox = new JCheckBox("CheckBox");
        panel.add(checkBox);

        // RadioButton
        JRadioButton radioButton = new JRadioButton("RadioButton");
        panel.add(radioButton);

        // ComboBox
        String[] opciones = {"Opción 1", "Opción 2", "Opción 3"};
        JComboBox<String> comboBox = new JComboBox<>(opciones);
        panel.add(comboBox);

        // Popup Menu
        JPopupMenu popupMenu = new JPopupMenu();
        popupMenu.add(new JMenuItem("Opción 1"));
        popupMenu.add(new JMenuItem("Opción 2"));
        panel.setComponentPopupMenu(popupMenu);

        // JOptionPane
        JOptionPane.showMessageDialog(ventana, "Bienvenido a mi aplicación.");

        // Cambio de color de fondo
        panel.setBackground(Color.CYAN);

        // Cambio de icono
        ImageIcon icono = new ImageIcon("icono.png");
        ventana.setIconImage(icono.getImage());

        ventana.add(panel);
        ventana.setVisible(true);
    }
}
