import java.util.Random;

public class EjemploClaseMath {
    public static void main(String[] args) {
        // La clase Math es estatico entoces no se pueden crear instancias
//        Random random = new Random();
        double random_math_number1 = Math.random() * 101;
        double random_math_number2 = Math.random() * 101;

        int absoluto = Math.abs(-3);
        System.out.println("absoluto = " + absoluto);

//        double random_double1 = random.nextDouble();
//        double random_double2 = random.nextDouble();
        double max_num= Math.max(random_math_number1,random_math_number2);
        System.out.println("Máximo = " + max_num);

        double min_num = Math.min(random_math_number1,random_math_number2);
        System.out.println("Mínimo = " + min_num);

        double techo = Math.ceil(3.1);
        System.out.println("Redondeo Techo de 3.1= " + techo);

        double piso = Math.floor(3.9);
        System.out.println("Redondeo Piso de 3.9= " + piso);

        long redondeo = Math.round(3.5);
        System.out.println("Redondeo de 3.5 = " + redondeo);

        double pi = Math.PI;
        System.out.println("Math.PI = " + pi);


    }
}
