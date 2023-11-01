import java.lang.reflect.Method;

public class EjemploMetodoGetClass {
    public static void main(String[] args) {

        String texto = "hola";

        Class strClass = texto.getClass();

        System.out.println("strClass.getName() = " + strClass.getName());
        System.out.println("strClass.getSimpleName() = " + strClass.getSimpleName());
        System.out.println("strClass.getPackageName() = " + strClass.getPackageName());
        System.out.println("strClass = " + strClass + "\n");

        for (Method method: strClass.getMethods()){
            System.out.println("metodo.getName() = " + method.getName());
        }
        System.out.println("\n");

        Integer num = 34;
        Class intClass = num.getClass();
        Class objClass = intClass.getSuperclass().getSuperclass();
        System.out.println("intClass.getSuperClass() = " + objClass);

        for (Method method: objClass.getMethods()){
            System.out.println("method.getName() = " + method.getName() );
        }


    }
}
