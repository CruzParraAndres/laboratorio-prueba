package programaweb3;
import java.util.Scanner;
public class esprimo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int c = 0;
		a = sc.nextInt();
		for (int i = 2;i<=a;i++ ) {
			if (a % i == 0) {
				c = c + 1;
			}
		}
		if (c == 1) {
			System.out.println(a + " es un numero primo");
		}
		else {
			System.out.println(a + " no es un numero primo ");
		}
		
		sc.close();
	}

}
