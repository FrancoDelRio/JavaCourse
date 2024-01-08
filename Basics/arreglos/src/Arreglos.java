import java.util.Arrays;

public class Arreglos {
    public static void main(String[] args) {

        //------ARREGLOS----------
        int[] enteros = new int[4];
        String[] productos = new String[4];
        // String productos[] = new String[7];

        //***********************ARREGLO DE ENTEROS************************
        enteros[0] = 1;
        enteros[1] = Integer.parseInt("2");
        enteros[2] =  (int)3L;
        enteros[3] =  4;
        // enteros[4] = 5;


        int i_ = enteros[0];
        int j = enteros[1];
        int k = enteros[2];
        int l = enteros[3];
        // int m = enteros[4];

        System.out.println("i = " + i_);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);

        //***********************ARREGLO DE CADENA************************
        System.out.println(" ");
        System.out.println("**********************");
        System.out.println(" ");

        System.out.println("producto[0] = " + productos[0]);
        System.out.println("producto[1] = " + productos[1]);
        System.out.println("producto[2] = " + productos[2]);
        System.out.println("producto[3] = " + productos[3]);

        productos[0] = "memoria";
        productos[1] = "tarjeta madre";
        productos[2] = "procesador";
        productos[3] = "ram";

        /* for (String producto: productos){
            System.out.println(producto);
        } */
        System.out.println("Lista Modificada:");
        for (int i = 0; i < productos.length; i++){
            System.out.println("producto[" + i + "] = " + productos[i]);
        }

        Arrays.sort(productos);
        System.out.println("Lista Ordenada:");
        for (int i = 0; i < productos.length; i++){
            System.out.println("producto[" + i + "] = " + productos[i]);
        }




    }
}
