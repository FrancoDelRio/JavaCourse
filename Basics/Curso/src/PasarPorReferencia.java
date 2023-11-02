public class PasarPorReferencia {
    public static void main(String[] args) {

        int[] edades = {10,11,12,13};
        System.out.println("iniciamos el método main con las edades:");

        for (int edad : edades) {
            System.out.println("edad[i] = " + edad);
        }

        test (edades);
        System.out.println("Despues de llamar el metodo test:");

        for (int i = 0; i < edades.length; i++){
            System.out.println("edad[i] = " + edades[i]);
        }

    }

    public static void test(int[] edades) {
        System.out.println("Iniciamos el método test");
        for (int i = 0; i < edades.length; i++){
            edades[i] =  edades[i] + 20;
        }

    }
}
