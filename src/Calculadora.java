import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a mi calculadora\n");

        while (true) {
            System.out.println("\nIngrese el primer numero: ");
            int num1 = sc.nextInt();
            System.out.println("Ingrese el segundo numero: ");
            int num2 = sc.nextInt();

            System.out.println("Que operacion desea realizar? (Suma = S; Resta = R; Multiplicacion = M ; Division = D)");
            String operacion = sc.next();

            double resultado;


            switch (operacion) {
                case "S":
                case "s":
                    resultado = num1 + num2;
                    System.out.println(num1 + " + " + num2 + " = " + resultado);
                    break;
                case "R":
                case "r":
                    resultado = num1 - num2;
                    System.out.println(num1 + " - " + num2 + " = " + resultado);
                    break;
                case "M":
                case "m":
                    resultado = num1 * num2;
                    System.out.println(num1 + " * " + num2 + " = " + resultado);
                    break;
                case "D":
                case "d":
                    resultado = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + resultado);
                    break;
                case "P":
                case "p":
                    double elevado = Math.pow(num1, 2);
                    resultado = elevado;
                    System.out.println(num1 + " ^ " + "2  = " + resultado);
                    break;

                default:
                    System.out.println("Operacion incorrecta");


            }
        }

    }
}
