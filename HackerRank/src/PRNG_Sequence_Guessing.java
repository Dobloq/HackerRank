import java.util.*;

public class PRNG_Sequence_Guessing {
	// funciona pero casos 5 y 6 no cumplen las condiciones de entrada (?)
	// caso 5
	// dsfdsfdf
	// dsfdfd
	// caso 6
	// sdddddd
	// ddddddddd
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int casos = sc.nextInt();
		for (int i = 0; i < casos; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			Integer[] array = new Integer[10];
			for (int j = 0; j < 10; j++) {
				array[j] = sc.nextInt();
			}
			Random r = new Random();
			int semilla = 0;
			for (int j = a; j < b; j++) {
				r = new Random(j);
				for (int j2 = 0; j2 < array.length; j2++) {
					if (array[j2]==r.nextInt(1000)) {
						if (j2==8) {
							semilla = j;
						}
					} else {
						break;
					}
				}
			}
			r = new Random(semilla);
			for (int j = 0; j < 20; j++) {
				int tmp = r.nextInt(1000);
				if (j == 8) {
					System.out.print(semilla + " ");
				}
				if (j > 9) {
					System.out.print(tmp + " ");
				}
			}
			System.out.println();
		}
		sc.close();

	}
}