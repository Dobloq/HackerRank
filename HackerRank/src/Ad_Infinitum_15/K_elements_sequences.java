package Ad_Infinitum_15;

import java.util.Arrays;
import java.util.Scanner;

public class K_elements_sequences {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int casos = sc.nextInt();
		for (int i = 0; i < casos; i++) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int sqn = 0;
			Integer[] secuencia = new Integer[k];
			Arrays.fill(secuencia, 1);
			for (int l = 1; l < n - 1; l++) {
				for (int j = secuencia.length - 1; j > 0; j--) {
					for (int j2 = 1; j2 < n - 1; j2++) {
						if (suma(secuencia) == n) {
							sqn++;
						}
						if (secuencia[j] == n - 1) {
							Arrays.fill(secuencia, l);
						}
						secuencia[j]++;
					}
				}
			}
			System.out.println(sqn);
		}
	}

	private static Integer suma(Integer[] array) {
		return Arrays.stream(array).mapToInt(n -> n).sum();
	}

}
