public class ArgumentosLineaComando {
    public static void main(String[] args) {
        // Para correr se tiene que estar en la misma carpte donde se encuentra este codigo en la terminal
        // javac ArgumentosLineaComando.java *PARA COMPILAR EL CODIGO*
        // java ArgumentosLineaComando franco chuy etc *PARA EJECUTAR PASANDO ARGUMENTOS*

        // Checamos los argumentos ingresados en la terminal
        if (args.length == 0){
            // Mensaje si no se ingresaron argumentos
            System.out.println("Ingresa argumentos");
            System.exit(-1);
        } else {
            // recorremos la lista de argumentos ingresados y los imprimimos
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argumentos n = " + i + ": " + args[i]);
            }
        }
        // En caso de que algo tenga acentos se tiene que compilar de la sig manera
        // javac ArgumentosLineaComando.java -encoding utf8
    }
}
