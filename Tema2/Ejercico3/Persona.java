import java.io.Serializable;

public class Persona implements Serializable {
    private static final long serialVersionUID = 100L;
    String nombre;
    String mail;
    int anyo;

    @Override
    public String toString() {
        return "Persona:\n" + "\tNombre: " + nombre + "\n\tE-mail: " + mail + "\n\tAño: " + anyo;
    }
}