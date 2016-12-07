import java.util.Scanner;

public class Bot_saves_princess_2 {

	// perfecto
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		Character[][] grid = new Character[t][t];
		int posP1 = 0;
		int posP2 = 0;
		int posB1 = sc.nextInt();
		int posB2 = sc.nextInt();
		for (int i = 0; i < t; i++) {
			String tmp = sc.next();
			for (int j = 0; j < tmp.length(); j++) {
				grid[i][j] = tmp.charAt(j);
				if (tmp.charAt(j) == 'p') {
					posP1 = i;
					posP2 = j;
				}
			}
		}
		if (posP1 - posB1 > 0) {
			System.out.println("DOWN");
		} else if (posP1 - posB1 < 0) {
			System.out.println("UP");
		} else if (posP2 - posB2 > 0) {
			System.out.println("RIGHT");
		} else if (posP2 - posB2 < 0) {
			System.out.println("LEFT");
		}
		sc.close();
	}
}
