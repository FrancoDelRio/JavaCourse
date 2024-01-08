import java.util.function.BooleanSupplier;

public class ArreglosOrdenamientoenesimo {
    public static void main(String[] args) {

        String[] productos =  {"1ro", "2do", "3ro", "4to",
                "5to", "6to", "7mo",
                "8vo", "9no", "10mo"};

        int productosLength = productos.length;


        for (int i = 0 ; i < 5 ; i++){
            System.out.println(productos[i] + " : " + productos[productosLength - i -1]);
        }

        int[] numeros = new int [10];
        int[] a = new int[10];


        int numerosLength= numeros.length;

        for (int i = 0; i < numerosLength ; i++){
            numeros[i] = i + 1;
        }

        for (int i = 0; i < numerosLength - i; i++){
            System.out.println(numeros[i] + " : " + numeros[numerosLength - 1 - i]);
        }

        int aLength = a.length;
        int aux = 0;

        for (int i = 0 ; i < aLength - i ; i ++){
            a[aux] = i + 1;
            a[aux+1] = aLength - i;
            aux += 2;
        }
//        System.out.println("---------");
//        for (int i = 0; i < aLength - i; i++){
//            System.out.println(a[i] + " : " + a[aLength - 1 - i]);
//        }

    }
}
