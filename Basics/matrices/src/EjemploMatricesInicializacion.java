public class EjemploMatricesInicializacion {
    public static void main(String[] args) {

        int[][] numeros_matrices = new int[2][4];
        int filas = numeros_matrices.length;
        int columnas = numeros_matrices[0].length;

        System.out.println(filas);
        System.out.println(columnas);

        numeros_matrices[0][0] = 1;
        numeros_matrices[0][1] = 2;
        numeros_matrices[0][2] = 3;
        numeros_matrices[0][3] = 4;

        numeros_matrices[1][0] = 11;
        numeros_matrices[1][1] = 12;
        numeros_matrices[1][2] = 13;
        numeros_matrices[1][3] = 14;

        imprimirMatriz(numeros_matrices);
    }

    public static void imprimirMatriz(int[][] matriz){
        int filas = matriz.length;
        int columnas = matriz[0].length;
        System.out.println("Matriz:");
        for (int[] fila : matriz){
            System.out.print("[");
            for (int element : fila){
                System.out.print(element + " ");
            }
            System.out.print("]");
            System.out.println("");
        }
    }

}
