import java.util.Scanner;

public class Ejeercicioprueba {
    public static void main(String[] args) {
        double nota;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la nota: ");
        nota = sc.nextInt();

        while (true) {
            if (nota >= 9 && nota <= 10) {
                System.out.println("A");
                break;
            } else if (nota >= 8 && nota <= 8.9) {
                System.out.println("B");
                break;
            } else if (nota >= 7 && nota <= 7.9) {
                System.out.println("C");
                break;
            } else if (nota >= 6 && nota <= 6.9) {
                System.out.println("D");
                break;
            } else if (nota < 6) {
                System.out.println("F");
                break;
            } else if (nota > 10 || nota < 0) {
                System.out.println("La mota que a introducido no es correcta, introduzca una valida:");
                nota = sc.nextInt();
            }
        }
    }
}
