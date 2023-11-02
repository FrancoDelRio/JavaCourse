public class PasarPorValor {
    public static void main(String[] args) {

        int i = 10;

        test (i);
        System.out.println("iniciamos el método main con i = " + i);
    }

    public static void test(int i) {
        System.out.println("Iniciamos el método test con i = " + i);
        i = 35;
        System.out.println("Finalizamos el método con i = " + i);
    }
}
