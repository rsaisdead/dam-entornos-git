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

        System.out.println("Frecuencia de numeros");
        boolean[] visitado = new boolean[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            if (visitado[i]) continue;
            int contador = 1;
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    contador++;
                    visitado[j] = true;
                }
            }
            System.out.println("El numero " + numeros[i] + " se repite " + contador + " veces.");
        }

        System.out.print("Introduce un numero para eliminar: ");
        int numEliminar = sc.nextInt();

        int countEliminados = 0;
        for (int num : numeros) {
            if (num == numEliminar) countEliminados++;
        }

        int[] nuevoArray = new int[numeros.length - countEliminados];
        int index = 0;
        for (int num : numeros) {
            if (num != numEliminar) {
                nuevoArray[index++] = num;
            }
        }
        System.out.println("Array tras eliminar el " + numEliminar + ": " + Arrays.toString(nuevoArray));
    }
}
