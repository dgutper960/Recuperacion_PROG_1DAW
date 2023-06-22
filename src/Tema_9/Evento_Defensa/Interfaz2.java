package Tema_9.Evento_Defensa;

/* Importamos los paquetes AWT y Swing*/

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/* La clase debe extender de FJrame */
public class Interfaz2 extends JFrame {
    public static void main(String[] args) {
        /* Instanciamos la clase */
        Interfaz2 aplicacion = new Interfaz2();
        aplicacion.setVisible(true);

    }

    public Interfaz2(){
        /* Definimos el tamaño del contenedor */
        setSize(450, 350);

        /* Definimos la acción para el cierre */
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /* Definimos dos paneles y asignamos un etiqueta a cada uno */
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JLabel label1 = new JLabel("Etiqueta 1");
        JLabel label2 = new JLabel("Etiqueta 2");
        panel1.add(label1);
        panel2.add(label2);

        /* Definimos botones y los asignamos a sus respectivos Listener */
        JButton boton1 = new JButton("Botón 1");
        JButton boton2 = new JButton("Botón 2");

        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hola, has pulsado el botón 1","Cacahuete", JOptionPane.INFORMATION_MESSAGE);
            }
        }); // Añadimos los botones a sus respectivos paneles
        panel1.add(boton1);
        getContentPane().add(panel1);

        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hola, has pulsado el botón 2", "Alcachofa", JOptionPane.INFORMATION_MESSAGE);
            }
        }); // Añadimos los botones a sus respectivos paneles
        panel2.add(boton2);
        getContentPane().add(panel2);
    }
}
