import javax.swing.*;

public class ArreglosEscuelita {
    public static void main(String[] args) {
        double[] matematicas, geografia, historia;
        String[] names = {"Tito", "Mito", "Fito", "Pito"};
        int numAlumnos = 4;

        matematicas = new double[numAlumnos];
        geografia = new double[numAlumnos];
        historia = new double[numAlumnos];


        llenarCalificaciones(matematicas, names, "matematicas");
        llenarCalificaciones(geografia, names, "geografia");
        llenarCalificaciones(historia, names, "historia");

        System.out.println("Calificaciones matematicas");
        imprimirCalificaiones(matematicas);

        System.out.println("Calificaciones geografia");
        imprimirCalificaiones(geografia);

        System.out.println("Calificaciones historia");
        imprimirCalificaiones(historia);


        System.out.println("Promedio matematicas:");
        double promedioMate = promedioAsignatura(matematicas);
        System.out.println(promedioMate);

        System.out.println("Promedio geografia:");
        double promedioGeo = promedioAsignatura(geografia);
        System.out.println(promedioGeo);

        System.out.println("Promedio historia:");
        double promedioHis = promedioAsignatura(historia);
        System.out.println(promedioHis);

        System.out.println("Promedio total del curso");
        double promedioTotal = (promedioGeo + promedioHis + promedioMate) / 3;
        System.out.println(promedioTotal);






    }

    public static void llenarCalificaciones (double[] asignaturas, String[] alumnos, String materia){
        for (int i = 0 ; i < asignaturas.length ; i++){

            String message = "Calificacion de " + alumnos[i];
            String title = materia;

            int userInput = Integer.parseInt(JOptionPane.showInputDialog(null,message, title, JOptionPane.QUESTION_MESSAGE));
            asignaturas[i] = userInput;

            /*try {
                double userInput = Integer.parseInt(JOptionPane.showInputDialog("Calificaion"));
                asignaturas[i] = userInput;
            } catch (NumberFormatException e){
                System.out.println("Tiene que ser un numero: " + e);
            }*/

        }
    }

    public static void imprimirCalificaiones(double[] asignatura){
        for (double element : asignatura){
            System.out.print(element + " ");
        }
        System.out.println("\n");
    }

    public static double promedioAsignatura (double[] asignatura){
        double resultado = 0;
        for (double element : asignatura){
            resultado += element;
        }
        resultado = resultado / asignatura.length;
        return resultado;
    }

}
