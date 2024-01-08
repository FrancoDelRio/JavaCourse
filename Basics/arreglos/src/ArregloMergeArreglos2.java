import java.util.Scanner;

public class ArregloMergeArreglos2 {
    public static void main(String[] args) {
        int[] a= new int[5];
        Scanner input = new Scanner(System.in);
        int aLength = a.length;

        System.out.println("Ingresa los " + aLength + " elementos de la lista: ");
        for (int i = 0 ; i  < aLength ; i++){
            a[i] = input.nextInt();
        }

        int max = 0;
//        for (int element : a){
//            if (element > max){
//                max = element;
//            }
//        }
        for (int i = 0 ; i  < aLength ; i++){
            /* position
            max = (a[max] > a[i]) ? max :i;
            */

            // max number
            max = (max > a[i]) ? max:a[i];
        }

        System.out.println("Numero mayor de la lista = " + max);
    }
}
