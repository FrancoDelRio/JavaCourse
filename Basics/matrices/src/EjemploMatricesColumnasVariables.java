public class EjemploMatricesColumnasVariables {
    public static void main(String[] args) {

        int[][] matriz = new int[3][];

        matriz[0] = new int[2];
        matriz[1] = new int[3];
        matriz[2] = new int[4];

        int matriz_length =  matriz.length;

        System.out.println("matriz length: " + matriz_length);
        System.out.println("fila 0 length: " + matriz[0].length);
        System.out.println("fila 1 length: " + matriz[1].length);
        System.out.println("fila 2 length: " + matriz[2].length);

        for  (int i = 0; i < matriz_length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = i*j;
            }
        }

        for (int i = 0; i < matriz_length; i++){
            for(int j = 0; j < matriz[i].length ; j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println(" ");
        }

    }
}
