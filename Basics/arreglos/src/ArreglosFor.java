import java.util.Arrays;

public class ArreglosFor {
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

        // Creamos la variable con el length para no crearla en cada iteracion del for
        int lenght_productos =  productos.length;

        // Asignamos valores
        productos[0] = "memoria";
        productos[1] = "tarjeta madre";
        productos[2] = "procesador";
        productos[3] = "ram";

        //
        Arrays.sort(productos);
        System.out.println("for:");
        for (int i = 0; i < lenght_productos; i++){
            System.out.println("producto[" + i +"] = " + productos[i]);
        }
        System.out.println("for each");
        for (String producto: productos){
            System.out.println("producto: " + producto);
        }

        System.out.println("while");
        int count = 0;
        while (count < lenght_productos){
            System.out.println("producto: " + productos[count]);
            count ++;
        }

        System.out.println("do while");
        int count_dowhile = 0;
        do {
            System.out.println("producto: " + productos[count_dowhile]);
            count_dowhile ++;
        } while(count_dowhile < lenght_productos);

        int[] numeros_mul3 = new int[10];

        int lengthNumerosmul3 = numeros_mul3.length;
        for (int i = 0; i < lengthNumerosmul3; i++){
            numeros_mul3[i] = i*3;
        }

        for (int i = 0; i < lengthNumerosmul3; i++){
            System.out.println("3 x " + i + " = "  + numeros_mul3[i]);
        }



    }
}
