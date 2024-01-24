package Ejer3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * La clase {@code Ejer3} representa una aplicación de muestra con una ventana principal
 * que contiene varios componentes gráficos como etiquetas, botones, casillas de verificación, etc.
 *
 * <p>La aplicación demuestra el uso de Swing para crear interfaces gráficas de usuario básicas.</p>
 *
 * @author Juan
 * @version 1.0
 * @since 2024-01-24
 */
public class Ejer3 {

    /**
     * Método principal que inicia la aplicación.
     *
     * @param args Los argumentos de la línea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            crearVentanaPrincipal();
        });
    }

    /**
     * Crea y muestra la ventana principal de la aplicación.
     */
    private static void crearVentanaPrincipal() {
        JFrame ventana = new JFrame("Mi Aplicación");
        ventana.setSize(400, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));

        // Etiqueta
        JLabel label = new JLabel("Etiqueta:");
        panel.add(label);

        // Botón
        JButton button = new JButton("Botón");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(ventana, "Has hecho clic en el botón.");
            }
        });
        panel.add(button);

        // Casilla de verificación
        JCheckBox checkBox = new JCheckBox("CheckBox");
        panel.add(checkBox);

        // Botón de radio
        JRadioButton radioButton = new JRadioButton("RadioButton");
        panel.add(radioButton);

        // Cuadro combinado
        String[] opciones = {"Opción 1", "Opción 2", "Opción 3"};
        JComboBox<String> comboBox = new JComboBox<>(opciones);
        panel.add(comboBox);

        // Menú emergente
        JPopupMenu popupMenu = new JPopupMenu();
        popupMenu.add(new JMenuItem("Opción 1"));
        popupMenu.add(new JMenuItem("Opción 2"));
        panel.setComponentPopupMenu(popupMenu);

        // Cuadro de diálogo JOptionPane
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
