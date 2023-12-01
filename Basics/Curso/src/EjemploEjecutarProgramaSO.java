public class EjemploEjecutarProgramaSO {
    public static void main(String[] args) {
        // Creamos una instancia RunTime y guardamos en rt el RunTime de la app actual
        Runtime rt =  Runtime.getRuntime();

        // rt.exec, regresará un objeto Process para poder manipularlo
        Process process;
        // try/catch por si no se encuentra ningún SO o un programa ejecutable
        try {
            // Obtenemos el OS y si es Windows abrimos notepad guardando el proceso un nuestra variable
            if (System.getProperty("os.name").toLowerCase().startsWith("windows")){
                process = rt.exec("notepad");
                // Obtenemos el OS y si es Mac abrimos textedit guardando el proceso un nuestra variable
            } else if (System.getProperty("os.name").toLowerCase().startsWith("mac")){
                process = rt.exec("textedit");
                // Si no es Linux y abrimos knotes guardando el proceso un nuestra variable
            } else {
                process = rt.exec("kate");
            }
            // Esperamos a que el proceso finalize
            process.waitFor();
            // En el catch usamos una Exception General
            /* Ya que si no tendríamos que usar:
            * IOException para los ifs
            * InterruptedException para el waitFor*/
        } catch (Exception e){
            // Usamos System.err para que sea un distintivo de error
            System.err.println("Error en encontrar el programa a ejecutar");
            // System.exit para salir del programa en caso de erro
            System.exit(1);
        }
        // Se ejecuta cuando waitfor detecta que la app finalizo
        System.out.println("Ha finalizado el proceso");
        // Cerramos el programa con el status 0 de que funciono
        System.exit(0);
    }
}
