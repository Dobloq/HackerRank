import java.util.Scanner;

public class BotClean_Stochastic {
	public static Integer[] pos = { 0, 0 };

	// perfecto
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// posicion actual del bot
		Character[][] grid = new Character[5][5];
		int posD1 = 0;
		int posD2 = 0;
		int posB1 = sc.nextInt();
		int posB2 = sc.nextInt();
		for (int i = 0; i < 5; i++) {
			String tmp = sc.next();
			for (int j = 0; j < 5; j++) {
				grid[i][j] = tmp.charAt(j);
				if (tmp.charAt(j) == 'b') {
					posB1 = i;
					posB2 = j;
				} else if (tmp.charAt(j) == 'd') {
					posD1 = i;
					posD2 = j;
				}
			}
		}
		if (posD2 - posB2 > 0) {
			System.out.println("RIGHT");
			posB2++;
		} else if (posD2 - posB2 < 0) {
			System.out.println("LEFT");
			posB2--;
		} else if (posD1 - posB1 > 0) {
			System.out.println("DOWN");
			posB1++;
		} else if (posD1 - posB1 < 0) {
			System.out.println("UP");
			posB1--;
		} else if (grid[posB1][posB2] == 'd') {
			System.out.println("CLEAN");
		}
		sc.close();
	}

	// private static int vectores(List<Integer[]> list, Integer[] pos) {
	// List<Double> res = new ArrayList<Double>();
	// // se halla el vector a cada posicion "dirty" desde el robot
	// for (int i = 0; i < list.size(); i++) {
	// res.add(Math.sqrt(Math.pow(list.get(i)[0] - posB1, 2) +
	// Math.pow(list.get(i)[1] - posB2, 2)));
	// }
	// // se consigue la posicion del mas cercano
	// return res.indexOf(res.stream().min(Comparator.naturalOrder()).get());
	// }
}
