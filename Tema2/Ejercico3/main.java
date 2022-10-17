import javax.swing.*;

public class main {
    public static void main(String[] args) {
        Ventanas ventInicial=new Ventanas();

        JButton btBuscar=new JButton();
        btBuscar.setText("Buscar");
        btBuscar.setSize(100,50);
        btBuscar.setLocation(0,0);

        JButton btAnyadir=new JButton();
        btAnyadir.setText("Añadir");
        btAnyadir.setSize(100,50);
        btAnyadir.setLocation(110,0);

        JButton btVer=new JButton();
        btVer.setText("Ver");
        btVer.setSize(100,50);
        btVer.setLocation(220,0);

        ventInicial.add(btBuscar);
        ventInicial.add(btAnyadir);
       // ventInicial.add(btVer);
        ventInicial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
