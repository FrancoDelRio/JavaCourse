public class WrapperOperadoresRelacionales {
    public static void main(String[] args) {

        Integer num1 = 1000;
        Integer num2 = num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // Aqui al usar '==' comparamos el objeto no el valor
        // (si son primitivos si compara el valor)
        System.out.println("Son el mismo objeto? " + (num1 == num2));

        num2 = 1000;
        System.out.println("Son el mismo objeto? " + (num1 == num2));
        // Comparar Objetos(instancias) por valor
        System.out.println("Tienen el mismo valor? " + (num1.equals(num2)));

        // Coversion a primitivos
        System.out.println("Tienen el mismo valor? " + (num1.intValue() == num2.intValue()));

        // Con el uso de operadores aritmeticos se pueden usar wrappers
        // ya que el autounboxing se hace automaticamente de manera implicita
        // autoboxing = de primitivo ====> clase wrapper
        // autounboxinb = de clase wrapper (referencia) ====> primitivo
    }
}
