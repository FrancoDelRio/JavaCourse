public class EjemploMathRandom {
    public static void main(String[] args) {

        String [] colores = {"azul","amarillo","morado","negro","rojo","verde"};
        double num_random=  Math.random();
        System.out.println("Numero random 0 a 1 excluido = " + num_random);
        num_random *= colores.length;

        System.out.println("Numero 0 a 6 incluido= " + num_random);
        // Excluimos el 6
        double random =  Math.floor(num_random);
        System.out.println("Numero de 0 a 5 incluido");

        System.out.println("Color random = " + colores[(int)random]);


    }
}
