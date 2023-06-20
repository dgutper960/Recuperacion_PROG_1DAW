package Tema_9.Actividad_9_1;
import java.awt.*;
public class Main extends Frame{
    /**
     * Enunciado:
     * Se pide implementar una interfaz gráfica (GUI) para el acceso de usuarios a una plataforma genérica (pantalla de
     * login) utilizando la API de Java AWT de acuerdo a lo estudiado en clase. La interfaz deberá permitir al usuario
     * introducir su nombre de usuario y su contraseña, además del componente de control necesario para aceptar los datos
     * introducidos o para cancelar saliendo de la pantalla.
     *
     * No es necesario implementar ninguna funcionalidad para los componentes de dicha interfaz, símplemente la parte visual.
     * */

    // Crearemos el frame, pero antes deberemos crear el constructor
    public Main(){
        Frame login=new Frame("my login window");
        login.setSize(400,350);
        login.setVisible(true);
        login.setLayout(null);

        // Ahora crearemos los distintos componentes label necesarios
        Label nombre=new Label("nombre: ");
        nombre.setBounds(90,100,50,32);
        nombre.setBackground(Color.white);
        nombre.setVisible(true);
        login.add(nombre);

        Label contrasena=new Label("contraseña: ");
        contrasena.setBounds(80,170,70,32);
        contrasena.setBackground(Color.white);
        contrasena.setVisible(true);
        login.add(contrasena);

        // Ahora crearemos varios componenetes de tipo TextField
        TextField nombre2=new TextField("");
        nombre2.setBounds(170,105,70,22);
        nombre2.setVisible(true);
        login.add(nombre2);

        TextField contrasena2=new TextField("");
        contrasena2.setBounds(170,175,70,22);
        contrasena2.setVisible(true);
        login.add(contrasena2);

        // Terminaremos la creación de este login
        Button acceder=new Button("Acceso");
        acceder.setBounds(90,255,70,22);
        acceder.setVisible(true);
        login.add(acceder);

        Button cancel=new Button("Cancelar");
        cancel.setBounds(190,255,70,22);
        cancel.setVisible(true);
        login.add(cancel);
    }


    public static void main(String[] args) {
        // Creamos un
        Main prueba=new Main();
    }
}