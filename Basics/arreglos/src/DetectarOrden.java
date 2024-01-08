public class DetectarOrden {
    public static void main(String[] args) {
        int[] ordenA = {1,2,3,4,5,6};
        int[] ordenD = {6,5,4,3,2,1};
        int[] ordenI = {1,1,1,1,1};
        int[] ordenDesorden = {5,3,2,5,2,1};

        detectarOrden(ordenA);
        detectarOrden(ordenD);
        detectarOrden(ordenDesorden);

        detectarOrden(ordenI);
    }

    public static void detectarOrden (int[] arreglo){
        boolean ascendente = false;
        boolean descendente = false;
        for (int i = 0 ; i < arreglo.length -1; i ++){
            if (arreglo[i] < arreglo[i+1]){
                ascendente = true;
            } else if (arreglo[i] > arreglo[i+1]){
                descendente = true;
            }
        }
        if (ascendente && descendente){
            System.out.println("El arreglo esta desordenado");
        }

        if (!ascendente && !descendente){
            System.out.println("Todos son iguales");
        }

        if (ascendente && !descendente){
            System.out.println("El orden es Ascendente");
        }

        if (!ascendente && descendente){
            System.out.println("El orden es Descendente");
        }

    }
}
