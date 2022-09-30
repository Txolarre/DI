import java.util.Scanner;

public class EJ4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un casa:");
        String casa=entrada.nextLine();
        String cualidad="";
        boolean fallo=false;
        switch (casa){
            case "gryffindor":{
                cualidad="bravery";
            }
            break;
            case "hufflepuff":{
                cualidad="loyalty";
            }
            break;
            case "slytherin":{
                cualidad="cunning";
            }
            break;
            case "ravenclaw":{
                cualidad="intellect";
            }
            break;
            default:{
                fallo=true;
                System.out.println("la casa " + casa + " no es valida.");
            }
        }
        if(!fallo) {
            System.out.println("la cualidad de la casa " + casa + " es: " + cualidad + ".");
        }
    }
}
