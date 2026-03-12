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

        int sumaEdades = 0;
        for (int edad : edades) {
            sumaEdades += edad;
        }
        double mediaEdades = (double) sumaEdades / edades.length;
        System.out.println("Media de edad: " + mediaEdades);
    }
}