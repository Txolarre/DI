import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class EJ7 {
    public static void main(String[] args) throws IOException {
        //trata de leer un fichero y al finalizar lo cierra
        Reader reader = null;
        try {
            reader = new FileReader("file.txt");
            // code which may throw an exception
        } finally {
            reader.close();
        }
    }
}
