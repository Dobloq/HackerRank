import java.util.Scanner;

public class Girar_matrices {
	// funciona pero solo para 4x4
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int r = sc.nextInt();
		Integer[][] grid = new Integer[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				grid[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < r; i++) {
			grid = girar(grid);
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}

	private static Integer[][] girar(Integer[][] grid) {
		Integer[][] res = new Integer[grid.length][grid.length];
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				// anillos exteriores
				if (i < grid.length - 1 && j == 0)
					res[i + 1][0] = grid[i][j];
				else if (i == 0 && j > 0)
					res[i][j - 1] = grid[i][j];
				else if (i == grid.length - 1 && j < grid.length - 1)
					res[i][j + 1] = grid[i][j];
				else if (i > 0 && j == grid.length - 1)
					res[i - 1][j] = grid[i][j];
			}
		}
		res[1][1] = grid[1][2];
		res[1][2] = grid[2][2];
		res[2][1] = grid[1][1];
		res[2][2] = grid[2][1];
		return res;
	}
}
