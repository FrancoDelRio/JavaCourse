import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParese {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

        System.out.println("Ingresa un fecha con formato dia-mes-año");
        try {
            Date fecha = format.parse(input.next());
            System.out.println("fecha = " + fecha);
            System.out.println("fecha = " + format.format(fecha));

            Date fecha2 = new Date();
            System.out.println(fecha2);

            if (fecha.after(fecha2)){
                System.out.println("Fecha del usuario es despues de la fecha2");
            } else if (fecha.before(fecha2)){
                System.out.println("Fecha del usuario es antes de la fecha 2");
            } else if (fecha.equals(fecha2)){
                System.out.println("Fecha del usuario es igual a la fecha actual");
            }
        } catch (ParseException e){
            throw new RuntimeException(e);
        }

    }
}
