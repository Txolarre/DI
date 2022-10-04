import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class PrimeraVentana extends JFrame {

    public PrimeraVentana(){
        super("Mi primera ventana");
        setSize(300,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.red);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        new PrimeraVentana();
        //cambia el color de fondo a uno más chulo

        //coloca la ventana en el centro

        //coloca una imagen de fondo
    }
}
