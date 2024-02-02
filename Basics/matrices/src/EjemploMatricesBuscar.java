public class EjemploMatricesBuscar {
    public static void main(String[] args) {
        int[][] matrizEnteros= {
            {34,65,23,87},
            {76,24,985,67},
            {294,73,89,27}
        };

        int numBusqueda = 100;

        buscarNumero(matrizEnteros, numBusqueda);


    }

    public static void buscarNumero(int[][] matriz, int numero){
        int matriz_length = matriz.length;
        boolean encontrado = true;

        while (encontrado) {

            for (int i = 0; i < matriz_length ;i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    if (matriz[i][j] == numero) {
                        System.out.println("Numero encontrado en:");
                        System.out.println("fila = " + i + ", columna = " + j);
                        break;
                    }
                }
            }
            if (encontrado == true){
                System.out.println("El numero " + numero + " no existe en la matriz");
                break;
            }
        }
    }
}
