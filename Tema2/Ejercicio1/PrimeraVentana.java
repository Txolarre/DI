import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PrimeraVentana extends JFrame {

    public PrimeraVentana(){
        super("Mi primera ventana");

        setSize(300,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //cambia el color de fondo a uno más chulo
        getContentPane().setBackground(Color.red);
        //coloca la ventana en el centro
        setLocationRelativeTo(null);
        //Poner imagen de fondo
        ImageIcon fondo=new ImageIcon("/home/pausos/IdeaProjects/DI/Tema2/Ejercicio1/donut.png");
        JPanel panel = new JPanel();
        //panel.add(fondo);
        setVisible(true);

    }

    public static void main(String[] args) {
        new PrimeraVentana();
        //coloca una imagen de fondo
    }
}
