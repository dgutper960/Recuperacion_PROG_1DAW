package Tema_9.Evento_Defensa;

/** Importamos los paquetes */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/** Creamos la clase que extiende de JFrame lo que significa que representa una ventana en una aplicación de escritorio*/
public class MyInterfaz extends JFrame {

    /** Método main, necesario para que la interfaz esté en uso */
    public static void main(String[] args) {
        /** Se crea un instanca de la clase */
        MyInterfaz aplicacion = new MyInterfaz();
        /** La instancia se hace visible en pantalla */
        aplicacion.setVisible(true);
    }

    public MyInterfaz() {
        /** Definimos el contenedor en pixeles */
        setSize(400, 200);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); /** Acción para el cierre  */
        /** Definimos un panel */
        JPanel panel = new JPanel();
        /** Definimos una etiqueta con un mensaje */
        JLabel label = new JLabel("Interfaz personalizada");
        /** Añadimos la etiqueta al panel */
        panel.add(label);

        /** Definimos el botón para el evento */
        JButton btnHazClick = new JButton("Click Here!");

        /** Se agrega ActionListener al botón */
        btnHazClick.addActionListener(new ActionListener() {
            /*En este caso, se crea una instancia anónima de la interfaz ActionListener utilizando una clase anónima.
            Esto significa que se crea una implementación de la interfaz ActionListener directamente en el lugar donde se necesita,
            sin necesidad de crear una clase separada. */

            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "¿Que pasa illoo!!??\nEstaba dormido... ¬¬", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }  /* Dentro de esta implementación anónima,
        se define el método actionPerformed(ActionEvent e), que se invocará automáticamente
        cuando se produzca el evento de acción, es decir, cuando se haga clic en el botón */
        });
        panel.add(btnHazClick);
        /** Se agrega el botón al panel*/
        getContentPane().add(panel);
        /** Se agrega el panel al contenedor */
    }

}

