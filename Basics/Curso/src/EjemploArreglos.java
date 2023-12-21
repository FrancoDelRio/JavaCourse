public class EjemploArreglos {
    public static void main(String[] args) {

        // Como se declaran los arreglos
        int[] numeros = new int[3];
        Product[] productos = new Product[3];
        String[] nombres = new String[3];

        //Segunda manera de declarar arreglos
        //int[] numerosEjemplo2 = {1,2,3,4};
        int[] numerosEjemplo2 = new int[]{1, 2, 3, 4};
        Product[] productosEjemplo2 = new Product[]{
                new Product("pelota"), new Product("esponja"), new Product("trapeador")};
        String[] nombresEjemplo2 =  new String[]{"gabriel", "mariano", "pablo"};


        //Como se define la información de los arreglos
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;

        productos[0] = new Product("vaso");
        productos[1] = new Product("tenis");
        productos[2] = new Product("raqueta");

        nombres[0] = "martin";
        nombres[1] = "roberto";
        nombres[2] = "franco";

        //Obtener valores de los arreglos
        int num1 = numeros[0];
        int num2 = numeros[1];
        int num3 = numeros[2];

        Product producto1 = productos[0];
        Product producto2 = productos[1];
        Product producto3 = productos[2];

        String nombre1 = nombres[0];
        String nombre2 = nombres[1];
        String nombre3 = nombres[2];

        // Comprobacion
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num2);
        System.out.println("producto1 = " + producto1);
        System.out.println("producto2 = " + producto2);
        System.out.println("producto3 = " + producto3);
        System.out.println("nombre1 = " + nombre1);
        System.out.println("nombre2 = " + nombre2);
        System.out.println("nombre3 = " + nombre3);

        // Recorrer los arreglos
        for (int i  = 0 ; i < numerosEjemplo2.length ; i++){
            System.out.println("Numero en la posicion " + i + " = " + numerosEjemplo2[i]);
        }

        for (String nom: nombresEjemplo2){
            System.out.println("Nombre  = " + nom);
        }
    }

    public static class Product {
        private String name;

        public Product(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
