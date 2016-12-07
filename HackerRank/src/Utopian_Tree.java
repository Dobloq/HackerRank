import java.util.Scanner;

public class Utopian_Tree {

	// perfecto
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int altura = 1;
			int cycles = sc.nextInt();
			do {
				if (cycles <= 0) {
					break;
				}
				altura *= 2;
				cycles--;
				if (cycles > 0) {
					altura += 1;
					cycles--;
				}
			} while (cycles >= 0);
			System.out.println(altura);
		}
		sc.close();
	}

}
