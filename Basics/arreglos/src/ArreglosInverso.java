import java.lang.reflect.Array;
import java.util.Arrays;

public class ArreglosInverso {
    public static void main(String[] args) {

        String[] nombres = new String[4];
        int[] numeros =  new int[4];

        nombres[0] = "Mariano";
        nombres[1] = "Alberto";
        nombres[2] = "Rodrigo";
        nombres[3] = "Javier";

        numeros[0] = 23;
        numeros[1] = 65;
        numeros[2] = 6;
        numeros[3] = -1;

        Arrays.sort(nombres);
        Arrays.sort(numeros);

        System.out.println("Order acendente");
        int length = 4;
        for (int i = 0; i < length; i++){
            System.out.println("nombre " + i + " = " + nombres[i]);
        }
        for (int i = 0; i < length; i++){
            System.out.println("numero " + i + " = " + numeros[i]);
        }

        System.out.println("Orden Inverso");
        for (int i = 0; i < length; i++){
            System.out.println("nombre " + (length-1-i) + " = " + nombres[length-1-i]);
        }

        for (int i = length -1 ; i >= 0; i--){
            System.out.println("numero " + i + " = " + numeros[i]);
        }

    }
}
