package Tema_9.Actividad_9_3;

import java.awt.*;
import java.awt.event.*;

public class Main extends Frame {

    private TextField campoTexto;
    private TextField campoContrasena;
    private Frame primerFrame;

    Main() {
        setTitle("Login");
        setSize(400, 300);
        setLayout(new GridLayout(3, 2));

        // Etiqueta "nombre"
        add(new Label("Nombre:"));

        // Campo de texto para el nombre
        campoTexto = new TextField(10);
        add(campoTexto);

        // Etiqueta "contraseña"
        add(new Label("Contraseña:"));

        // Campo de texto para la contraseña. Usamos el metodo setEchoChar, para conseguir que la contraseña no se muestre
        campoContrasena = new TextField(10);
        campoContrasena.setEchoChar('*');
        add(campoContrasena);

        // Botón "Acceso"
        Button accesoUsuario = new Button("Acceso");
        accesoUsuario.setBackground(Color.decode("#FFF91"));
        accesoUsuario.setFont(new Font("Comic Sans MS",Font.BOLD,16));
        add(accesoUsuario);

        primerFrame = this; // Referencia al frame principal

        accesoUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Frame f = new Frame();
                f.setTitle("Bienvenido");
                f.setSize(400,300);
                f.setLocationRelativeTo(null);
                f.setLayout(new BorderLayout());
                f.setVisible(true);
                Label saludo = new Label("Bienvenido a la DeepWeb");
                saludo.setForeground(Color.WHITE);
                saludo.setBackground(Color.DARK_GRAY);
                saludo.setAlignment(Label.CENTER);
                saludo.setFont(new Font("Comic Sans MS", Font.ITALIC, 32));
                f.add(saludo, BorderLayout.CENTER);
                f.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        f.dispose();
                        primerFrame.dispose(); // Cerrar el frame principal al cerrar la ventana emergente
                    }
                });
            }
        });

        // Botón "Cancelar"
        Button cancelar = new Button("Cancelar");
        cancelar.setBackground(Color.decode("#FF6767"));
        cancelar.setFont(new Font("Comic Sans MS",Font.BOLD,16));
        add(cancelar);

        cancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiarFormulario();
            }
        });

        // Cerrar ventana
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        // Crear item de menú "Limpiar formulario"
        MenuItem limpiarItem = new MenuItem("Limpiar formulario");
        limpiarItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiarFormulario();
            }
        });

        // Crear item de menú "Salir"
        MenuItem salirItem = new MenuItem("Salir");
        salirItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // Cerrar la ventana principal
            }
        });

        // Crear menú "Opciones" y agregar items "Limpiar formulario" y "Salir"
        Menu opcionesMenu = new Menu("Opciones");
        opcionesMenu.add(limpiarItem);
        opcionesMenu.add(salirItem);

        // Crear barra de menú y agregar menú "Opciones"
        MenuBar menuBar = new MenuBar();
        menuBar.add(opcionesMenu);

        // Asignar la barra de menú al frame
        setMenuBar(menuBar);

        // Ahora crearemos un menú llamado ayuda,, y lo añadimos a la barra de menu
        Menu ayudaMenu=new Menu("Ayuda");
        menuBar.add(ayudaMenu);

        setVisible(true);
    }

    // En este metodo lo que hacemos es externalizar la opción de limpiar los textfields, para poder usarlo
    // En distintas partes del código y evitar duplicación de código
    private void limpiarFormulario() {
        campoTexto.setText(null);
        campoContrasena.setText(null);
    }

    public static void main(String[] args) {
        new Main();
    }
}