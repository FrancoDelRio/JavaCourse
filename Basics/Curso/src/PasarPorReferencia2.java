class Persona{
    private String nombre;

    public void modificarNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    public String getNombre() {
        return this.nombre;
    }
}

public class PasarPorReferencia2 {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.modificarNombre("Franco del Rio");

        System.out.println("Initialized main method");
        System.out.println("persona.nombre = " + persona.getNombre());


        test (persona);
        System.out.println("After calling test method:");

        System.out.println("persona.nombre = " + persona.getNombre());

    }

    public static void test(Persona persona) {
        persona.modificarNombre("Chuy Perez");
    }
}
