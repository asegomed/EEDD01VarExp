import java.util.Scanner;

public class EjercicioPrimos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Dime un numero: ");
            int num;
            num = sc.nextInt();
            boolean isPrimo = true;

            if (num <= 1) {
                isPrimo = false;
            } else {
                for (int i = 2; i < num; i++) {
                    if (num % i == 0) {
                        isPrimo = false;
                        break;
                    }
                }
            }
            if (isPrimo) {
                System.out.println("Es primo " + num);
                break;
            } else {
                System.out.println("No es primo\n");
            }
        }


    }
}
