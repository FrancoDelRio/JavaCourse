public class ArreglosOrdenamientoBurbuja2 {
    public static void main(String[] args) {

        Integer[] numeros = new Integer[7];
        numeros[0] = 43;
        numeros[1] = 763;
        numeros[2] = 1;
        numeros[3] = 5646;
        numeros[4] = 234;
        numeros[5] = 65;
        numeros[6] = 23;

        // Cast int to Integer
        // (Integer)34.compareTo(45) = -1
            // (Comparable)34.compareTo(45)

        int lengthNumeros = numeros.length;

        System.out.println("Desorenado");
        printArreglo(numeros);

//        for (int i = 0; i < lengthNumeros - 1; i++){
//            for (int j = 0; j < lengthNumeros - 1 - i; j++){
//                if (numeros[j+1] < numeros[j]){
//                    int temp = numeros[j];
//                    numeros[j] = numeros[j+1];
//                    numeros[j+1] = temp;
//                }
//                contador ++;
//            }
//        }
        ordenamientoBurbuja(numeros);

        System.out.println("Ordenado");
        printArreglo(numeros);

    }

    public static <E> void printArreglo(E[] array){
        for (E elmentos: array){
            System.out.println(elmentos);
        }
    }

    public static void ordenamientoBurbuja(Integer[] arreglo){
        int lengthArreglo = arreglo.length;

        for (int i = 0; i < lengthArreglo - 1; i++){
            for (int j = 0; j < lengthArreglo - 1 - i; j ++){
                if (arreglo[j+1].compareTo(arreglo[j]) < 0){
                    int temp =  arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = temp;
                }
            }
        }
    }

}
