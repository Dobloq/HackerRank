import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class BotClean {
	public static Integer[] pos = { 0, 0 };

	// perfecto
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// posicion actual del bot
		pos[0] = sc.nextInt();
		pos[1] = sc.nextInt();
		// matriz
		Character[][] grid = new Character[5][5];
		// lista con las posiciones "dirty"
		List<Integer[]> list = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			String tmp = sc.next();
			for (int j = 0; j < tmp.length(); j++) {
				grid[i][j] = tmp.charAt(j);
				if (tmp.charAt(j) == 'd') {
					Integer[] array = { i, j };
					list.add(array);
				}
			}
		}
		// posicion del "dirty" mas cercano al bot
		int posicion = vectores(list, pos);
		// fila de d
		int posD1 = list.get(posicion)[0];
		// columna de d
		int posD2 = list.get(posicion)[1];
		if (posD2 - pos[1] > 0) {
			System.out.println("RIGHT");
			pos[1]++;
		} else if (posD2 - pos[1] < 0) {
			System.out.println("LEFT");
			pos[1]--;
		} else if (posD1 - pos[0] > 0) {
			System.out.println("DOWN");
			pos[0]++;
		} else if (posD1 - pos[0] < 0) {
			System.out.println("UP");
			pos[0]--;
		} else if (grid[pos[0]][pos[1]] == 'd') {
			System.out.println("CLEAN");
			list.remove(posicion);
		}
		sc.close();
		// for (int i = 0; i < 5; i++) {
		// for (int j = 0; j < grid.length; j++) {
		// System.out.print(grid[i][j]+" ");
		//
		// }
		// System.out.println();
		// }
	}

	private static int vectores(List<Integer[]> list, Integer[] pos) {
		List<Double> res = new ArrayList<Double>();
		// se halla el vector a cada posicion "dirty" desde el robot
		for (int i = 0; i < list.size(); i++) {
			res.add(Math.sqrt(Math.pow(list.get(i)[0] - pos[0], 2) + Math.pow(list.get(i)[1] - pos[1], 2)));
		}
		// se consigue la posicion del mas cercano
		return res.indexOf(res.stream().min(Comparator.naturalOrder()).get());
	}
}
