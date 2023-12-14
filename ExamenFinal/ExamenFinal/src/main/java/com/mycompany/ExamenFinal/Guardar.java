package com.mycompany.ExamenFinal;
 

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Guardar {

    private static JFrame frame;
    private static JTextField idMecanico;
    private static JTextField Nombre;
    private static JTextField Edad;
    private static JTextField Domicilio;
    private static JComboBox<String> Titulo;
    private static JTextField Especialidad;
    private static JTextField SueldoBase;
    private static JTextField GratTitulo;
    private static JTextField SueldoTotal;
    private static JButton btnAceptar;
    private static JButton btnCancelar;
    
    public Guardar() {
    }

    public static void main(String[] args) {
       //Lanza la interfaz de usuario
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        //Se crea y configura la ventana de reservación
        frame = new JFrame("Datos");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        // Se crean componentes
        idMecanico = new JTextField();
        Nombre = new JTextField();
        Edad = new JTextField();
        Domicilio = new JTextField();
        Titulo = new JComboBox<>(new String[]{"Ingeniero mecanico", "Ayudante mecanico"});
        Especialidad = new JTextField();
        SueldoBase = new JTextField();
        GratTitulo = new JTextField();
        SueldoTotal = new JTextField();
        btnAceptar = new JButton("Aceptar");
        btnCancelar = new JButton("Cancelar");

        //Se crea un panel de cuadricula para organizar los componentes
        JPanel panel = new JPanel(new GridLayout(11, 2));

        // Se agregar componentes y etiquetas al panel
        panel.add(new JLabel("idMecanico:"));
        panel.add(idMecanico);

        panel.add(new JLabel("Nombre:"));
        panel.add(Nombre);

        panel.add(new JLabel("Edad:"));
        panel.add(Edad);

        panel.add(new JLabel("Domicilio:"));
        panel.add(Domicilio);
        
        panel.add(new JLabel("Titulo:"));
        panel.add(Titulo);
        
        panel.add(new JLabel("Especialidad:"));
        panel.add(Especialidad);
        
        panel.add(new JLabel("Sueldo Base:"));
        panel.add(SueldoBase);
        
        panel.add(new JLabel("Gratificacion Titulo:"));
        panel.add(GratTitulo);
        
        panel.add(new JLabel("Sueldo Total:"));
        panel.add(SueldoTotal);


        panel.add(new JLabel(""));
        panel.add(new JLabel(""));

        panel.add(btnAceptar);
        panel.add(btnCancelar);

        //Agrega el panel a la ventana principal
        frame.add(panel);

        // Se Configura acciones de los botones
        btnAceptar.addActionListener(e -> {
            guardarDatos();
            mostrarMensaje();
        });

        //Configura acciones de los botones
        btnCancelar.addActionListener(e -> frame.dispose());

        frame.setVisible(true);
    }
// Se guardan los datos
    private static void guardarDatos() {
        // Lógica para guardar datos en un arreglo y enviar a la interfaz de reservas
        String idmedico = idMecanico.getText();
        String nombre = Nombre.getText();
        String edad = Edad.getText();
        String domicilio = Domicilio.getText();
        String titulo = (String) Titulo.getSelectedItem();
        String especialidad = Especialidad.getText();
        String sueldoBase = SueldoBase.getText();
        String gratTitulo = GratTitulo.getText();
        String sueldoTotal = SueldoTotal.getText();
      

   
    }

    private static void mostrarMensaje() {
        JOptionPane.showMessageDialog(null, "Datos guardados exitosamente.");
    }
    
    
}
