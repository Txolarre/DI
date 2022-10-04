import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class PrimeraVentana extends JFrame {

    public PrimeraVentana(){
        super("Mi primera ventana");
        setSize(300,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //cambia el color de fondo a uno más chulo
        getContentPane().setBackground(Color.red);
        //coloca la ventana en el centro
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        new PrimeraVentana();
        //coloca una imagen de fondo
    }
}
