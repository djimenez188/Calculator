import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el primer número");
        double num_one = entrada.nextDouble();

        System.out.println("Introduce el segundo número");
        double num_two = entrada.nextDouble();
        entrada.nextLine();

        System.out.println("Que operación desas realizar /+/-/*///% :");
        String operacion = entrada.nextLine();

        double resultado = 0;
        boolean operacionValida = true;

        switch (operacion) {
            case "+":
                resultado = num_one + num_two;
                break;
            case "-":
                resultado = num_one - num_two;
                break;
            case "*":
                resultado = num_one * num_two;
                break;
            case "/":
                resultado = num_one / num_two;
                break;
            case "%":
                resultado = num_one % num_two;
                break;
            default:
                System.out.println("El operador o los valores introducidos no son correctos");
                operacionValida = false;
        }
        if (operacionValida) {
            System.out.println("Los valores " + num_one + " y " + num_two + " y el operador " + operacion + " dan como resultado " + resultado);
        }
        entrada.close();
    }
}
