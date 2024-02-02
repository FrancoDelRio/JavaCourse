public class EjemploAutomonvil {
    public static void main(String[] args) {

        Automovil auto =  new Automovil("marca", "modelo");
        /*auto.marca = "nissan";
        auto.modelo = "kicks";
        auto.color = "rojo";
        auto.cilindraje = 8;
        auto.capacidadTanke = 30;*/

        auto.setColor("rojo");
        auto.setCilindraje(9);
        auto.setCapacidadTanke(30);

        Automovil mazda = new Automovil("mazda", "2");
        /*mazda.marca = "mazda";
        mazda.modelo = "2";
        mazda.color = "plateado";
        mazda.cilindraje = 10;
        mazda.capacidadTanke = 40;*/
        auto.setColor("plateado");
        auto.setCilindraje(10);
        auto.setCapacidadTanke(40);


        /*System.out.println("auto.marca "+ auto.marca);
        System.out.println("auto.modelo "+ auto.modelo);
        System.out.println("auto.color "+ auto.color);
        System.out.println("auto.cilindraje "+ auto.cilindraje); */
        auto.detalle();
        System.out.println(auto.acelerar(100));

        System.out.println("\n");

        /*System.out.println("mazda.marca "+ mazda.marca);
        System.out.println("mazda.modelo "+ mazda.modelo);
        System.out.println("mazda.color "+ mazda.color);
        System.out.println("mazda.cilindraje "+ mazda.cilindraje);*/
        mazda.detalle();
        System.out.println(mazda.acelerar(500));
        System.out.println("\n");


        System.out.println("Consumo de 30km a 30%: " + mazda.calcularConsumo(30,0.30f));
    }
}
