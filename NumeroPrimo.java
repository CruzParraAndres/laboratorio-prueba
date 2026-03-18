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

    // Nuevo algoritmo: Verificación simple por divisores
    public static boolean esPrimo(int n) {
        // Números menores o iguales a 1 no son primos
        if (n <= 1) {
            return false;
        }

        // Verificamos si es divisible por cualquier número desde 2 hasta n-1
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;   // Encontramos un divisor → no es primo
            }
        }

        return true;  // Si no encontró ningún divisor, es primo
    }
}