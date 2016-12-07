import java.util.Scanner;

public class Find_digits {

	// perfecto
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			Integer n = sc.nextInt();
			int d = 0;
			String c = n.toString();
			for (int j = 0; j < c.length(); j++) {
				int tmp = Integer.parseInt(c.substring(j, j + 1));
				if (tmp != 0) {
					if (n % tmp == 0) {
						d++;
					}
				}
			}
			System.out.println(d);
		}
		sc.close();
	}

}
