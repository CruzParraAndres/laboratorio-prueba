import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingresa un número: ");
            int numero = sc.nextInt();

            if (esPrimo(numero)) {
                System.out.println(numero + " es primo.");
            } else {
                System.out.println(numero + " no es primo.");
            }
        }
    }
    public static boolean esPrimo(int n) {
        if (n <= 1) return false; // Los números menores o iguales a 1 no son primos
        if (n == 2) return true;  // El 2 es primo
        if (n % 2 == 0) return false; // Los pares mayores a 2 no son primos

        // Verificamos divisores desde 3 hasta la raíz cuadrada de n
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
