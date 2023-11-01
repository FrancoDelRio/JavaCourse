public class WrapperInteger {
    public static void main(String[] args) {

        // Para crear una variable wrapper, no se necesita ya ningún unboxing
        // Puede ser directo
        int intPrimitivo = 65234;

        // Primitivo ----> Wrapper (Clase)
        // Explicita (Integer.valueOf(primitivo))
        Integer intObjeto = Integer.valueOf(intPrimitivo);

        // Implicita
        Integer intObjeto2 = intPrimitivo;


        //  Wrapper (Clase) ----> Primitivo:

        // Implicita
        int num = intObjeto2;
        System.out.println("num = " + num);

        // Explicita (.intValue())
        int num2 = intObjeto2.intValue();
        System.out.println("num2 = " + num2);

        // String ---> Integer
        String valorString = "2353";
        Integer valor = Integer.valueOf(valorString);

        // Short ----> Wrapper:
        Short shortObjeto = intObjeto.shortValue();
        System.out.println("shortObjeto = " + shortObjeto);

    }
}
