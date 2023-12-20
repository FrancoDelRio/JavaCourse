import java.util.Random;

public class EjemploMathRandom {
    public static void main(String[] args) {

        Random randomInstance = new Random();

        String [] colores = {"azul","amarillo","morado","negro","rojo","verde"};

        // ------------- Math Class ------------------------
        System.out.println("-------------Math Class-------------");
        double num_random=  Math.random();
        System.out.println("Numero random 0 a 1 excluido = " + num_random);
        num_random *= colores.length;

        System.out.println("Numero 0 a 6 incluido= " + num_random);
        // Excluimos el 6
        double random =  Math.floor(num_random);
        System.out.println("Numero de 0 a 5 incluido");

        System.out.println("Color random = " + colores[(int)random]);

        // -------------- Random Class ---------------------------
        System.out.println("-------------Random Class-------------");
        int num_entero = randomInstance.nextInt();
        // Numero de 0 a 10 no inclusivo
        // int num_entero = randomInstance.nextInt(10);
        System.out.println("random.nextInt = " + num_entero);

        long num_long = randomInstance.nextLong();
        System.out.println("random.nextLong = " + num_long);

        int random_condition = 15 + randomInstance.nextInt(25-14);
        System.out.println("Numero random de 15 a 25 = " + random_condition);

        num_entero = randomInstance.nextInt(colores.length);
        System.out.println("color random = " + colores[num_entero]);

    }
}
