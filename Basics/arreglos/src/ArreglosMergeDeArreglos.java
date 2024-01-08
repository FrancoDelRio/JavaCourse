public class ArreglosMergeDeArreglos {
    public static void main(String[] args) {

        String[] productos =  {"1ro", "2do", "3ro", "4to",
                "5to", "6to", "7mo",
                "8vo", "9no", "10mo"};
        int[] numeros = new int [10];
        int[] a = new int[10];

        int productosLength = productos.length;
        int numerosLength= numeros.length;
        int aLength = a.length;
        int aux = 0;


        for (int i = 0; i < numerosLength ; i++){
            numeros[i] = i + 1;
        }

        for (int i = 0 ; i < aLength - i ; i ++){
            a[aux] = i + 1;
            a[aux+1] = aLength - i;
            aux += 2;
        }

        int mergeLength = productosLength + numerosLength;
        String[] arregloMerge = new String[mergeLength];
        aux = 0;
        for (int i = 0 ; i < mergeLength - i ; i++){
            arregloMerge[aux] = productos[i];
            arregloMerge[aux + 1] = String.valueOf(numeros[i]);
            aux +=2;
        }

        for (String element: arregloMerge){
            System.out.println(element);
        }




    }
}
