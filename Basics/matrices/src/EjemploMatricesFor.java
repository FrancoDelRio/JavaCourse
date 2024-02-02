public class EjemploMatricesFor {
    public static void main(String[] args) {
        String[][] parejas = new String[3][2];
        int filas =  parejas.length;
        int columnas = parejas[0].length;

        parejas[0][0] = "Franco";
        parejas[0][1] = "Livier";


        parejas[1][0] = "pepe";
        parejas[1][1] = "pepa";


        parejas[2][0] = "pipi";
        parejas[2][1] = "popo";

        // For loop
        System.out.println("For Loop");
        for (int i = 0 ; i<filas ; i++){
            for (int j = 0; j<columnas; i++){
                System.out.println(parejas[i][j] + "\t");
            }
            System.out.println("");
        }

        // For each
        System.out.println("For each");
        for (String[] fila : parejas){
            for (String nombre : fila){
                System.out.println(nombre + "\t");
            }
            System.out.println("");
        }



    }
}
