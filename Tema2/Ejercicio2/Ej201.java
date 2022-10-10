import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Ej201 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //new Ventana();
        System.out.println("¿Cuantas ventanas quieres crear?");
        int entrada= leer.nextInt();
        for (int i=0,x=1,y=0;i<entrada;i++){
            Ventana ventana=new Ventana();
            ventana.setLocation(300*i,0);
        }
    }
}
