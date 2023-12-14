package com.mycompany.ExamenFinal;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class Listar extends JFrame {

    private JTable tablaDatos;
    private DefaultTableModel modeloTabla;

    public Listar(ArrayList<RegistroMecanico> datos) {
        // Configuración básica del JFrame
        setTitle("Lista de mecanicos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);

        // Crea modelo de la tabla
        modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("idMecanico");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Edad");
        modeloTabla.addColumn("Domicilio");
        modeloTabla.addColumn("Titulo");
        modeloTabla.addColumn("Especialidad");
        modeloTabla.addColumn("SueldoBase");
        modeloTabla.addColumn("GratTitulo");
        modeloTabla.addColumn("SueldoTotal");

        // Se Llena la tabla con los datos
        for (RegistroMecanico registro : datos) {
            modeloTabla.addRow(registro.toArray());
        }

        // Crear la tabla con el modelo
        tablaDatos = new JTable(modeloTabla);
        JScrollPane scrollPane = new JScrollPane(tablaDatos);

        // Añade la tabla al contenido del JFrame
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        
         // Agregar el botón "Cerrar" al panel
        JButton btnCerrar = new JButton("Cerrar");
        btnCerrar.addActionListener(e -> {
            // Cerrar la ventana actual y mostrar la interfaz inicial
            dispose();  // Cierra la ventana actual
            JFrame inicial = new JFrame();
            inicial.setVisible(true);
        });

        // Crear un panel para colocar el botón
        JPanel panelBoton = new JPanel();
        panelBoton.add(btnCerrar);

        // Añadir el panel de botón al final del JFrame
        getContentPane().add(panelBoton, BorderLayout.SOUTH);
        // Hacer visible la interfaz
        setVisible(true);
    }

    public static void main(String[] args) {
        // Uso
        ArrayList<RegistroMecanico> datos = new ArrayList<>();
        datos.add(new RegistroMecanico("1", "Jose Perez", "27", "Melinka #844", "Ingeniero mecanico", "800000", "150000", "950000"));
        datos.add(new RegistroMecanico("2", "Miguel Rojas", "32", "Acasias #900", "Ayudante mecanico", "500000", "0", "800000"));

        SwingUtilities.invokeLater(() -> new Listar(datos));
        
      
      
    }
}

class RegistroMecanico {
    private final String idMecanico;
    private final String Nombre;
    private final String Edad;
    private String Domicilio;
    private String Titulo;
    private String Especialidad;
    private String SueldoBase;
    private String GratTitulo;
    private String SueldoTotal;

    public RegistroMecanico(String idMecanico, String Nombre, String Edad, String Domicilo, String Titulo, String SueldoBase, String GratTitulo, String SueldoTotal) {
        this.idMecanico = idMecanico;
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Domicilio = Domicilio;
        this.Domicilio = Titulo;
        this.Domicilio = Especialidad;
        this.Domicilio = SueldoBase;
        this.Domicilio = GratTitulo;
        this.Domicilio = SueldoTotal;
    }

    public Object[] toArray() {
        return new Object[]{idMecanico, Nombre, Edad, Domicilio, Titulo, Especialidad, SueldoBase, GratTitulo, SueldoTotal};
    }
}