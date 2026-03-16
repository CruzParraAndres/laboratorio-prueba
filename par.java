import java.util.Scanner;
//Codigo para ver si un numero ingresado es par o no
System scanner = new Scanner(System.in);
int numero = scanner.nextInt();
if (numero % 2 == 0) {
    System.out.println("El número es par.");
} else {
    System.out.println("El número es impar.");
}