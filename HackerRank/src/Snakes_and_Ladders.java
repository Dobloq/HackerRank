import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Snakes_and_Ladders {

	// pasa el test pero al enviar solo acepta 1 y 4 stop for long time
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int casos = sc.nextInt();
		for (int i = 0; i < casos; i++) {
			Integer[][] ladders = null;
			int pareja = 0;
			int pos = 1;
			int aux = 0;
			int pasos = 0;
			List<Integer> snakes = new ArrayList<Integer>();
			int escaleras = sc.nextInt();
			ladders = new Integer[escaleras][2];
			for (int j = 0; j < escaleras; j++) {
				for (int j2 = 0; j2 < 2; j2++) {
					ladders[j][j2] = sc.nextInt();
				}
			}
			int serpientes = sc.nextInt();
			for (int j = 0; j < serpientes; j++) {
				snakes.add(sc.nextInt());
				sc.nextInt();
			}
			for (int j = 0; j < escaleras; j++) {
				int resta = ladders[j][1] - ladders[j][0];
				if (resta > pareja) {
					pareja = resta;
					aux = j;
				}
			}
			do {
				if (pos + 6 < ladders[aux][0]) {
					if (snakes.indexOf(pos + 6) == -1) {
						pos += 6;
						pasos++;
					}
				} else {
					if (pos < ladders[aux][0]) {
						pos = ladders[aux][1];
						pasos++;
					} else {
						if (snakes.indexOf(pos + 6) == -1 && pos + 6 < 100) {
							pos += 6;
							pasos++;
						} else if (pos + 6 > 100) {
							pos = 100;
							pasos++;
						}
					}
				}
			} while (pos != 100);
			System.out.println(pasos);
		}
		sc.close();
	}
}