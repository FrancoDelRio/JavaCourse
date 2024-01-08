import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArreglosMutables {
    public static void main(String[] args) {

        // Creación de arreglos
        // Arreglo 1
        Integer[] numeros = new Integer[4];
        int lengthNumeros = numeros.length;

        // Arreglo 2
        String[] productos = new String[4];
        int lengthProductos =  productos.length;

        //Llenado de arreglos
        // Llenado Arreglo 1
        numeros[0] = 56;
        numeros[1] = 3;
        numeros[2] = 98;
        numeros[3] = 4;

        // Ordenación de Arreglo 1
        Arrays.sort(numeros);

        // Llenado Arreglo 2
        productos[0] = "ram";
        productos[1] = "tarjeta madre";
        productos[2] = "procesador";
        productos[3] = "disco duro";

        // Ordenación de Arreglo 2
        Arrays.sort(productos);

        // Impresión de arreglos en orden

        System.out.println("Arreglos en orden");
        /*for (int numero : numeros){
            System.out.println(numero);
        }*/
        printArreglo(numeros);

        /*for (String producto : productos){
            System.out.println(producto);
        }*/
        printArreglo(productos);

        // Mutación de arreglos al revés
        System.out.println("-------------------");
        System.out.println("\nArreglos mutados");
        int lengthProductos2 = lengthProductos;

//         Mutación 1
//         Recorremos a la mitad del arreglo dividiendolo entre 2
//        for (int i = 0; i < lengthNumeros/2; i++){
//            int primero = numeros[i];
//            int ultimo = numeros[lengthNumeros - 1 -i];
//            numeros[i] = ultimo;
//            numeros[lengthNumeros - 1 -i] = primero;
//        }
//
//         Mutación 2
//         Usamos una variable extra que disminuye cada cambio para poder hacerlo a la mitad
//        for (int i = 0; i < lengthProductos2; i++){
//            String primero = productos[i];
//            String ultimo = productos[lengthNumeros - 1 -i];
//            productos[i] = ultimo;
//            productos[lengthNumeros - 1 -i] = primero;
//            lengthProductos2 --;
//        }

//         Mutación 3
//         Usando una funcion
//
//        mutarArreglo(numeros);
//        mutarArreglo(productos);
//
//

        // Mutación 4
        // Usando api Colletions de Java
        // "Arrays.asList" para convertir el arreglo a lista
        Collections.reverse(Arrays.asList(numeros));
        Collections.reverse(Arrays.asList(productos));

        //impresión de arreglos mutados
        printArreglo(numeros);
        printArreglo(productos);

    }

    public static <E> void printArreglo(E[] array){
        for (E element: array){
            System.out.println(element);
        }
    }

    public static <E> void mutarArreglo(E[] array){
        int arrayLength = array.length;
        int arrayLength2 = arrayLength;
        for (int i = 0; i < arrayLength2; i++){
            E temp = array[i];
            array[i] = array[arrayLength - i - 1];
            array[arrayLength - i - 1] = temp;
            arrayLength2 --;
        }
    }
}
