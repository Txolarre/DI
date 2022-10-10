import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame{
    public Ventana(){
        super("Mi primera ventana");
        setSize(300,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.red);
        //setLocationRelativeTo(null);
        setVisible(true);
    }
}
