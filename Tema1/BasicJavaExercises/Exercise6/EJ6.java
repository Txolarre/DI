import java.util.Scanner;

public class EJ6 {

        public static void main(String[] args) {
            //pide un número si está dentro del rango de elementos del array devuelve el número que esté en la posición del número
            int[] hardCodedArray = { 3, 2, 4, 5, 1 };
            Scanner scanner = new Scanner(System.in);
            int index = scanner.nextInt();
            if (index > hardCodedArray.length - 1) {
                System.out.println("The index is out of bounds.");
            } else {
                System.out.println(hardCodedArray[index]);
            }
        }

}
