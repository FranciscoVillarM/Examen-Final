package com.mycompany.ExamenFinal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExamenFinal {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Taller Mecanico");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JButton btnCrear = new JButton("Crear nuevo mecanico");
        JButton btnEditar = new JButton("Editar un mecanico");
        JButton btnListar = new JButton("Listar todos los mecanicos");
        JButton btnEliminar = new JButton("Eliminar un mecanico");

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1));
        panel.add(btnCrear);
        panel.add(btnEditar);
        panel.add(btnListar);
        panel.add(btnEliminar);

        frame.add(panel);

        btnCrear.addActionListener(e -> abrirGuardar());
        btnEditar.addActionListener(e -> abrirGuardar());
        btnListar.addActionListener(e -> abrirListar());

        frame.setVisible(true);
    }

    private static void abrirGuardar() {
        // Lógica para abrir la interfaz de Guardar
        Guardar.main(new String[]{});
    }

    private static void abrirListar() {
        // Lógica para abrir la interfaz de Listar
        Listar.main(new String[]{});
    }
}
