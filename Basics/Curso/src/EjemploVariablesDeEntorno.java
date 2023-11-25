import java.util.Map;

public class EjemploVariablesDeEntorno {
    public static void main(String[] args) {

        Map<String, String> enviroment =  System.getenv();

        System.out.println("Variables de Ambiente: " + enviroment);
        System.out.println("------------- Listando Variables De Ambiente --------------------");
        for (String key: enviroment.keySet()){
            System.out.println(key + " => " + enviroment.get(key));
        }

        String username = System.getenv("USERNAME");
        String sesion_type = System.getenv("XDG_SESSION_TYPE");

        System.out.println("Username: " + username);
        System.out.println("Sesion Type: " + sesion_type);
    }
}
