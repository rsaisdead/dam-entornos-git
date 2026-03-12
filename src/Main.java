import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cuantos numeros vas a introducir: ");
        int cantidad = sc.nextInt();
        int[] numeros = new int[cantidad];

        System.out.println("Ejercicio 1");
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Introduce un numero entero (" + (i + 1) + "/" + cantidad + "): ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("Numeros introducidos: " + Arrays.toString(numeros));

        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }

        double media = (double) suma / numeros.length;
        System.out.println("Suma: " + suma);
        System.out.println("Media: " + media);

        int mayor = numeros[0];
        int menor = numeros[0];
        int positivos = 0;
        int negativos = 0;

        for (int num : numeros) {
            if (num > mayor) mayor = num;
            if (num < menor) menor = num;
            if (num > 0) positivos++;
            if (num < 0) negativos++;
        }

        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
    }
}
