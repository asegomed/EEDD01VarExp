import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!\n");

        int a = 2;
        double b = 3.14;
        char c = 'c';
        String d = "hola";

        System.out.printf(a + " \n" + b + " \n" + c + " \n" + d);


        Scanner sc = new Scanner(System.in);

        System.out.println("\nIntroduzca un valor entero");
        a = sc.nextInt();
        System.out.println("\nEl valor entero es " + a);

        if (a % 2 == 0) {
            System.out.println("El numero "+ a + " es par");
        }else{
            System.out.println("El numero "+ a + " es impar");
        }



    }
}