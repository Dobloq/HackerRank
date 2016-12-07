import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Java_1D_Array {

	// 4 de 10 puntos
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int negativos = 0;
		List<Integer> a = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			a.add(sc.nextInt());
		}
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i) < 0) {
				negativos++;
			}
		}
		for (int i = 0; i < a.size() - 1; i++) {
			if (a.get(i) + a.get(i + 1) < 0) {
				negativos++;
			}
		}
		for (int i = 0; i < a.size() - 2; i++) {
			if (a.get(i) + a.get(i + 1) + a.get(i + 2) < 0) {
				negativos++;
			}
		}
		for (int i = 0; i < a.size() - 3; i++) {
			if (a.get(i) + a.get(i + 1) + a.get(i + 2) + a.get(i + 3) < 0) {
				negativos++;
			}
		}
		for (int i = 0; i < a.size() - 4; i++) {
			if (a.get(i) + a.get(i + 1) + a.get(i + 2) + a.get(i + 3) + a.get(i + 4) < 0) {
				negativos++;
			}
		}
		System.out.println(negativos);
		sc.close();
	}

}
