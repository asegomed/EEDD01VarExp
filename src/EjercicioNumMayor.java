

public class EjercicioNumMayor {
    public static void main(String[] args) {
        System.out.println("Bienvenido al programa para saber cual es el numero mayor\n");
        int num1;
        int num2;
        int num3;
        System.out.println("Ingrese el primer numero: ");
        num1 = Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese el segundo numero: ");
        num2 = Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese el tercer numero: ");
        num3 = Integer.parseInt(System.console().readLine());

        int mayor;

        if (num1 > num2 && num1 > num3) {
            mayor = num1;
            System.out.println("El numero mayor es: " + mayor);
        }else if (num2 > num1 && num2 > num3) {
            mayor = num2;
            System.out.println("El numero mayor es: " + mayor);
        }else if (num3 > num1 && num3 > num2) {
            mayor = num3;
            System.out.println("El numero mayor es: " + mayor);
        }else if (num1 == num2 || num1 == num3) {
            mayor = num3;
            System.out.println("Los tres numeros son iguales " + mayor);
        }

    }
}
