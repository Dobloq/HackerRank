import java.util.Scanner;

public class Java_1D_Array_Hard {

	// timeout
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int casos = sc.nextInt();
		for (int i = 0; i < casos; i++) {
			int pos = 0;
			int n = sc.nextInt();
			int m = sc.nextInt();
			int pasos = 0;
			String res = "NO";
			Integer[] a = new Integer[n];
			for (int j = 0; j < n; j++) {
				a[j] = sc.nextInt();
			}
			do {
				if (n > pos + m) {
					if (a[pos + m] == 0) {
						pos += m;
						pasos++;
					}
					if (a[pos + 1] == 0) {
						pos++;
						pasos++;
					}
				} else {
					res = "YES";
				}
			} while (pos < n || pasos == 50);
			System.out.println(res);
		}
		sc.close();
	}
}