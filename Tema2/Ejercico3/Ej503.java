import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Ej503 {
    static Path nombreFichero = Path.of("/home/pausos/IdeaProjects/AD/Tema1/Ejercicio5","personas.dat");
    //static Path nombreFichero = Path.of("D:\\ClasesDam\\AD\\Tema1\\Ejercicio5\\personas.dat");
    public static void main(String[] args) {
        boolean salir=false;
        ArrayList<Persona>ListaPers=new ArrayList<>();

        try (FileInputStream fis = new FileInputStream(nombreFichero.toFile());
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            ListaPers=(ArrayList<Persona>) ois.readObject();
        } catch(IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        do{
            int eleccion;
            Scanner entrada=new Scanner(System.in);
                System.out.println("Agenda\n\t[1] Introducir Persona\n\t[2] Buscar un contacto\n\t[0] Salir");
                eleccion=entrada.nextInt();
            switch (eleccion) {
                case 1 -> escribir(ListaPers);
                case 2 -> buscar(ListaPers);
                case 0 -> salir=true;
            }
        }while (!salir);
    }
    public static void escribir(ArrayList<Persona>ListaPersonas){
        Persona p1 = new Persona();
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce nombre:");
        p1.nombre=entrada.nextLine();
        System.out.println("Introduce E-mail:");
        p1.mail=entrada.nextLine();
        System.out.println("Introduce Año de nacimiento:");
        p1.anyo=entrada.nextInt();
        ListaPersonas.add(p1);
        try (FileOutputStream fos = new FileOutputStream(nombreFichero.toFile());
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(ListaPersonas);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    public static void buscar(ArrayList<Persona>ListaPersonas){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce nombre a buscar:");
        String Enombre=entrada.nextLine();
        Persona pers= new Persona();
        boolean esta=false;
        try (FileInputStream fis = new FileInputStream(nombreFichero.toFile());
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            ListaPersonas=(ArrayList<Persona>) ois.readObject();
            for (Persona p : ListaPersonas) {
                if (p.nombre.equals(Enombre)){
                    System.out.println(p.toString());
                    esta=true;
                }
            }
            if(!esta){
                System.out.println(Enombre+" no esta en la agenda");
            }
        } catch(IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
