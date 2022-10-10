import javax.swing.*;
import java.awt.*;

public class PrimeraVentana extends JFrame {

    public PrimeraVentana(){
        super("Mi primera ventana");
        //panelImage panel = new panelImage();
        setSize(300,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //cambia el color de fondo a uno más chulo
        getContentPane().setBackground(Color.red);
        //coloca la ventana en el centro
        setLocationRelativeTo(null);
        //Poner imagen de fondo
        //ImageIcon fondo=new ImageIcon(getClass().getResource("/home/pausos/IdeaProjects/DI/Tema2/Ejercicio1/donut.png"));
        PanelImage panel = new PanelImage();
        this.add(panel, BorderLayout.CENTER);
        //panel.add(fondo);
        setVisible(true);

    }

    public static void main(String[] args) {
        new PrimeraVentana();
        //coloca una imagen de fondo
    }
}
