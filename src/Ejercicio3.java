import java.util.Arrays;

public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 3");
        Integer[] numeros = new Integer[10];

        for (int i = 0; i < 10; i++) {
            numeros[i] = (int) (Math.random() * 100) + 1;
        }

        System.out.println("Array original: " + Arrays.toString(numeros));
    }
}
