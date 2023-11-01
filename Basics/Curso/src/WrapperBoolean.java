public class WrapperBoolean {
    public static void main(String[] args) {

        Integer num1, num2;

        num1 = 1;
        num2 = 2;
        // PRIMITIVO
        boolean primBoolean = num1 > num2; //false

        // REFERENCIA
        Boolean objBoolean = Boolean.valueOf(primBoolean);
        Boolean objBoolean2 = Boolean.valueOf("true");
        Boolean objBoolean3 = false;

        // IMPRESIONES
        System.out.println("primBoolean = " + primBoolean);
        System.out.println("objBoolean = " + objBoolean);
        System.out.println("objBoolean2 = " + objBoolean2);

        // COMPARANDO 2 BOOLEAN
        // No importa si es clase o primitivo siempre compara valores
        System.out.println("Comparando dos objetos boolean: " + (objBoolean == objBoolean2));
        System.out.println("Comparando dos objetos boolean: " + (objBoolean.equals(objBoolean2)));
        System.out.println("Comparando dos objetos boolean: " + (objBoolean == objBoolean3));


        // UNBOXING
        boolean primBoolean2 = objBoolean2.booleanValue();

        // BOXING
        Boolean objBoolean4 = Boolean.valueOf(primBoolean2);
    }
}
