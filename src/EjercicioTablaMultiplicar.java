import java.util.Scanner;

public class EjercicioTablaMultiplicar {
    public static void main(String[] args) {
        System.out.println("Dime un numero y te dire su tabla de multiplicar" );
        int numero;
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();

        int multiplicar;
        for (int i = 1; i <= 10; i++) {
            multiplicar = numero * i;
            System.out.println(numero +" * " + i + " = " +multiplicar);
        }
    }
}
