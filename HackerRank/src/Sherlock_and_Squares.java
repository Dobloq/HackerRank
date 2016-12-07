import java.util.Scanner;

public class Sherlock_and_Squares {

	// funciona 4, demas timeout
	// otro enfoque, raiz del primero, raiz del segundo y contar nº de enteros entre ambos
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = 0;
			for (int j = a; j <= b; j++) {
				if (Math.sqrt(j) == Math.round(Math.sqrt(j))) {
					c++;
				}
			}
			System.out.println(c);
		}
		sc.close();
	}

}
