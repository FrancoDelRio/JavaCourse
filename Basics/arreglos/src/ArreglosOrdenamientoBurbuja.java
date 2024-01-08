public class ArreglosOrdenamientoBurbuja {
    public static void main(String[] args) {

        Integer[] numeros = new Integer[4];
        String[] productos = new String[7];

        numeros[0] = 43;
        numeros[1] = 763;
        numeros[2] = 1;
        numeros[3] = 5646;

        productos[0] = "c";
        productos[1] = "a";
        productos[2] = "d";
        productos[3] = "b";
        productos[4] = "g";
        productos[5] = "f";
        productos[6] = "e";

        int lengthProductos = numeros.length;
        System.out.println("Desordenados:");
        System.out.println("---Productos:---");
        printArreglo(productos);

        System.out.println("---Números:---");
        printArreglo(numeros);

//        for (int i=0; i < lengthProductos -1; i++){
//            for (int j= 0 ; j < lengthProductos - 1 -i;j++){
//                // string1.compareTo(string) = -1 string 1
//                if (productos[j+1].compareTo(productos[j]) < 0 ){
//                    String temp =  productos[i];
//                    productos[i] = productos[j];
//                    productos[j] = temp;
//
//                }
//                contador ++;
//            }
//        }
        ordenamientoBurbuja(productos);
        ordenamientoBurbuja(numeros);

        System.out.println("Orden acendente:");
        System.out.println("---Productos:---");
        printArreglo(productos);

        System.out.println("---Números:---");
        printArreglo(numeros);


    }

    public static <E> void printArreglo(E[] array){
        for (E element: array){
            System.out.println(element);
        }
    }

    public static void ordenamientoBurbuja(Object[] arreglo){
        for (int i = 0; i < arreglo.length - 1; i++){
            for (int j = 0; j < arreglo.length - 1 - i; j++){
                if (((Comparable)arreglo[j]).compareTo(arreglo[j+1]) > 0){
                    Object aux  = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;
                }
            }
        }
    }


}
