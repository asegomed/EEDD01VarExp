import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!\n");
/*
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
            System.out.println("El numero " + a + " es par\n");
        } else {
            System.out.println("El numero " + a + " es impar\n");
        }


        if (a < 50) {
            System.out.println("El numero " + a + " es menor que 50");
        } else if (a > 50) {
            System.out.println("El numero " + a + " es mayor que 50");
        } else {
            System.out.println("El numero " + a + " es igual a 50");
        }


        //sentencia switch case
        System.out.println("\nIntroduzca un color(R/r, V/v, A/a): ");
        d = sc.next();
        c = d.charAt(0);

        switch (c) {
            case 'A':
            case 'a':
                System.out.println("Color Azul\n");
                break;
            case 'R':
            case 'r':
                System.out.println("Color Rojo\n");
                break;
            case 'V':
            case 'v':
                System.out.println("Color Verde\n");
                break;
            default:
                System.out.println("Color no registrado!!!!!!!!!!\n");
        }


        //bucles cuando se conoce a priori el numero de interaciones

        int suma = 0;
        int suma2 = 0;
        for (int i = 0; i < 10; i++) {
            suma = suma + i;
            suma2 += i;
        }
        System.out.println("La suma 1 es: " + suma);
        System.out.println("La suma 2 es: " + suma2);


        //Bucles cuando no se conoce a priori el numero de interacciones
        //Ejercicio --> Bucle que solicite al usuario hasta que introduzca un numero par
        int e;
        System.out.println("Introduzca un valor entero para comprobar si es par: ");
        e = sc.nextInt();

        while (true) {

            if (e % 2 == 0) {
                System.out.println("El numero " + e + " es par\n");
                break;
            } else {
                System.out.println("El numero " + e + " es impar, introduzca otro numero");
                e = sc.nextInt();

            }

        }
*/

        //conversion de tipos de datos
        int v1 = (int)2.9 +(int)1.1;
        System.out.println("Vi :" + v1);
        v1 = (int)(2.9+1);
        System.out.println("v1 :" + v1);

        //vi=()


        //Operadores
        System.out.println("\n");
        int a = 1 , b=2;
        System.out.println("a: " + a + ", b: " + b);
        a++; //postincremento
        ++b; //preincremento
        System.out.println("a: " + a + ", b: " + b);
        int c = a++ * ++b;
        System.out.println("a: " + a + ", b: " + b + ", c: " + c);

        //precedencia de operadores ()++ --
        System.out.println("\n");
        boolean b0 = (2+8) < ++a || 2+5*9 == a++ +43;
        System.out.println("b0: " + b0 + "; a: " +a);
        b0 = ++a < 10 || ++a ==6; //con un solo | se evaluan los dos lados
        System.out.println("b0: " + b0 + "; a: " +a);

/*
        String cad = "Hola";
        //sobrecarga de operadores: El operador se comporta de manera difirente segun sus operandos
        a = 1 + 1;
        cad = "1" + "1"; //es concadenacion
        System.out.println("Cad: " + cad);
        String cad1 = cad.substring(2,4);
        System.out.println("Cad1: " + cad1);
 */


        //Arrays
        System.out.println("\n");
        int []arrInt1 = new int[5];
        int []arrInt2 = {0,1,2,3,4};
        System.out.println("arrInt1: " + Arrays.toString(arrInt1));
        System.out.println("arrInt2" + Arrays.toString(arrInt2));

        int [][]matriz1 = new int[5][5];
        int [][]matriz2 = {{0,1,2,3,4},{0,1,2,3,4}};
        System.out.println("matriz1: \n" + Arrays.toString(matriz1[0]) + "\n" + Arrays.toString(matriz1[1]));
        System.out.println("matriz2: \n" + Arrays.toString(matriz2[0]) + "\n" + Arrays.toString(matriz2[1]));






    }
}