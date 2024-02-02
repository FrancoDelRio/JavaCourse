import java.util.Random;
import java.util.Scanner;

public class TestInterview {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adivine el numero random");
        int inputUsuer = scanner.nextInt();
        numeroRandom(inputUsuer);

    }
    public static void numeroRandom(int input) {
        Random random = new Random();
        int resultado = random.nextInt(2);
        System.out.println(resultado);
        if (input < resultado) {
            System.out.println("Muy abajo");
        } else if (input > resultado) {
            System.out.println("Muy arriba");
        } else {
            System.out.println("Adivinaste");
        }
    }

}
