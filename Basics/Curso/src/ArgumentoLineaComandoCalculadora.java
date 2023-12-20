public class ArgumentoLineaComandoCalculadora {
    public static void main(String[] args) {
        if (args.length != 3){
            System.err.println("FALTAN ARGUMENTOS");
            System.exit(-1);
        }
        String operacion = args[0];
        int num_a = 0;
        int num_b = 0;
        double resultado = 0.0;

        try {
            num_a = Integer.parseInt(args[1]);
            num_b = Integer.parseInt(args[2]);
        } catch (NumberFormatException e){
            System.err.println("Argumentos 2 y 3 tienen que ser numeros");
            System.exit(-1);
        }

            switch (operacion) {
                case "sum":
                    resultado = num_a + num_b;
                    break;
                case "res":
                    resultado = num_a - num_b;
                    break;
                case "mul":
                    resultado = num_a * num_b;
                    break;
                case "div":
                    if (num_b == 0) {
                        System.err.println("El numero b no puede ser 0");
                        System.exit(-1);
                    }
                    resultado = (double) num_a / num_b;
                    break;
                default:
                    resultado = num_a + num_b;
            }

            System.out.println("Resultado = " + resultado);
            System.exit(0);

    }
}
