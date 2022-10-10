import javax.swing.*;
import java.awt.*;

public class PanelImage extends JPanel {

    @Override
    public void paint(Graphics g){
        Dimension dimension = this.getSize();
        ImageIcon icon = new ImageIcon("/home/pausos/IdeaProjects/DI/Tema2/Ejercicio1/donut.png");
        g.drawImage(icon.getImage(), 0, 0, dimension.width, dimension.height, null);
        setOpaque(false);
        super.paintChildren(g);
    }

}
