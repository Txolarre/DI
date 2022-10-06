import java.io.FileReader;
import java.io.Reader;

public class EJ5 {
    public static void main(String[] args) {
        Reader reader = new FileReader("file.txt");
        int current = reader.read();
        while (current != -1) {
            System.out.print((char) current);
            current = reader.read();
        }
        reader.close();
    }
}
