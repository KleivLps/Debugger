import java.util.Scanner;

public class calculadoraDebugger {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar){
            System.out.println("Ingresa el primer numero: ");
            double num1 = scanner.nextDouble();

            System.out.println("Ingresa el segundo numero: ");
            double num2 = scanner.nextDouble();
            System.out.println("Seleccione la operacion (+, -, *, /): ");
            char operacion = scanner.next().charAt(0);

            try {
                double resultado = 0;
                switch (operacion) {
                    case '+':
                        resultado = num1 + num2;

                        break;
                    case '-':
                        resultado = num1 - num2;
                        break;
                    case '*':
                        resultado = num1 * num2;
                        break;
                    case '/':
                        resultado = num1 / num2;
                        break;
                    default:
                        System.out.println("Operacion no valida.");
                        continue;
                }
                System.out.println("El resultado de la operacion es: " +resultado);
            } catch (ArithmeticException e ) {
                System.out.println("Error: no es posible dividir por 0. ");
                e.printStackTrace();
            }

            System.out.println("¿Quieres realizar otra operacion? (SI/NO)");
            String respuesta = scanner.next();
            continuar = respuesta.equalsIgnoreCase("si");
        }
        scanner.close();
    }
}
