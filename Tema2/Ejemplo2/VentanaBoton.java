import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class VentanaBoton extends JFrame {
    private Container panel;
    private JButton miboton;
    public VentanaBoton(){
        super("Ejemplo 01 con botón");
        JFrame ventana = new JFrame("Escuchador botón");
        JButton boton = new JButton("Púlsame...");
        boton.addActionListener(new EscuchadoraBoton());//Registro escuchador
        ventana.addWindowListener(new EscuchadoraMini());
        ventana.getContentPane().add(boton);
        ventana.setSize(500, 500);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    public class EscuchadoraBoton implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Pulsaste el botón.");
        }
    }
    public class EscuchadoraMini implements WindowListener {
        //@Override
        public void actionPerformed(ActionEvent e) {

        }

        @Override
        public void windowOpened(WindowEvent e) {

        }

        @Override
        public void windowClosing(WindowEvent e) {

        }

        @Override
        public void windowClosed(WindowEvent e) {

        }

        @Override
        public void windowIconified(WindowEvent e) {
            System.out.println("Algo pequeñito");
        }

        @Override
        public void windowDeiconified(WindowEvent e) {
            System.out.println("Algo grandecito");
        }

        @Override
        public void windowActivated(WindowEvent e) {

        }

        @Override
        public void windowDeactivated(WindowEvent e) {

        }
    }

    public static void main(String[] args) {
        VentanaBoton aplicacion = new VentanaBoton();
    }

}
