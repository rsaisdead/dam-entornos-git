import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] edades = new int[5];

        System.out.println("Ejercicio 2");
        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce la edad " + (i + 1) + ": ");
            edades[i] = sc.nextInt();
        }

        System.out.println("Edades introducidas: " + Arrays.toString(edades));

        int min = edades[0];
        int max = edades[0];

        for (int edad : edades) {
            if (edad < min) min = edad;
            if (edad > max) max = edad;
        }

        System.out.println("Edad minima: " + min);
        System.out.println("Edad maxima: " + max);

        int mayores = 0;
        int menores = 0;

        for (int edad : edades) {
            if (edad >= 18) mayores++;
            else menores++;
        }

        System.out.println("Mayores de edad: " + mayores);
        System.out.println("Menores de edad: " + menores);

        int rango1 = 0, rango2 = 0, rango3 = 0, rango4 = 0;
        for (int edad : edades) {
            if (edad >= 0 && edad <= 17) rango1++;
            else if (edad >= 18 && edad <= 30) rango2++;
            else if (edad >= 31 && edad <= 50) rango3++;
            else if (edad >= 51) rango4++;
        }
        System.out.println("Rango 0-17: " + rango1 + " personas.");
        System.out.println("Rango 18-30: " + rango2 + " personas.");
        System.out.println("Rango 31-50: " + rango3 + " personas.");
        System.out.println("Rango +51: " + rango4 + " personas.");

        boolean todosMayores = true;
        for (int edad : edades) {
            if (edad < 18) {
                todosMayores = false;
                break;
            }
        }
        System.out.println("Todas las personas son mayores de edad: " + todosMayores);
    }
}