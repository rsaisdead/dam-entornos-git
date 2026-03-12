import java.util.Arrays;
import java.util.Collections;

public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 3");
        Integer[] numeros = new Integer[10];

        for (int i = 0; i < 10; i++) {
            numeros[i] = (int) (Math.random() * 100) + 1;
        }

        System.out.println("Array original: " + Arrays.toString(numeros));

        Arrays.sort(numeros, Collections.reverseOrder());

        System.out.print("Array ordenado: ");
        for (int num : numeros) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

        int contPares = 0, contImpares = 0;
        for (int num : numeros) {
            if (num % 2 == 0) contPares++;
            else contImpares++;
        }

        int[] pares = new int[contPares];
        int[] impares = new int[contImpares];
        int p = 0, imp = 0;

        for (int num : numeros) {
            if (num % 2 == 0) pares[p++] = num;
            else impares[imp++] = num;
        }
        System.out.println("Array de pares: " + Arrays.toString(pares));
        System.out.println("Array de impares: " + Arrays.toString(impares));
    }
}