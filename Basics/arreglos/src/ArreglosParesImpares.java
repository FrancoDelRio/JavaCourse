import java.util.Random;

public class ArreglosParesImpares {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arregloRandom =  new int[50];
        int pares = 0;
        int impares = 0;
        /*int randomNumber = random.nextInt(10,100);

        System.out.println(randomNumber);
        */

        for (int i = 0; i < 50 ; i++){
            int numeroRandom = random.nextInt(0,100);
            arregloRandom[i] = numeroRandom;
            if (numeroRandom % 2 == 0){
                pares ++;
            } else{
                impares ++;
            }
        }

        int[] arregloPares = new int[pares];
        int[] arregloImpares = new int[impares];
        int contadorPares = 0;
        int contadorImpares = 0;


        for (int element : arregloRandom){
            if (element % 2 == 0){
                arregloPares[contadorPares] = element;
                contadorPares ++;
            } else{
                arregloImpares[contadorImpares] = element;
                contadorImpares ++;
            }
        }


        System.out.println("Arreglo Principal");
        for (int element : arregloRandom){
            System.out.print(element + " ");

        }
        System.out.println("\n");

        System.out.println("Arreglo con los pares");
        for (int element : arregloPares){
            System.out.print(element + " ");

        }
        System.out.println("\n");

        System.out.println("Arreglo con los impares");
        for (int element : arregloImpares){
            System.out.print(element + " ");

        }
    }
}
