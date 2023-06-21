package Tema_9.Evento_Defensa;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyInterfaz extends JFrame {
    public static void main(String[] args) {
        MyInterfaz aplicacion = new MyInterfaz();
        aplicacion.setVisible(true);
    }

    public MyInterfaz() {
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JLabel label = new JLabel("Etiqueta");
        panel.add(label);

        JButton btn = new JButton("Hola");
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hola", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        panel.add(btn);

        JButton btnHazClick = new JButton("Haz click");
        btnHazClick.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Has hecho clic en el botón 'Haz click'", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        panel.add(btnHazClick);

        getContentPane().add(panel);
    }
}
