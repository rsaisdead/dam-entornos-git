import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        System.out.println("Ejercicio 1");
        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce un numero entero (" + (i + 1) + "/5): ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("Numeros introducidos: " + Arrays.toString(numeros));
    }
}
