package week_of_code_20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Divisible_Sum_Pairs {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		List<Integer> a = new ArrayList<>();
		List<Integer> b = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			a.add(sc.nextInt());
		}
		int i = 0;
		do {
			test(a, b, k);
			i++;
		} while (a.size() == 0 || i != n);
		System.out.println(b.size());
	}

	private static void test(List<Integer> a, List<Integer> b, int k) {
		boolean check = false;
		int i = 1;
		for (i = 1; i < a.size(); i++) {
			int tmp1 = a.get(0);
			int tmp2 = a.get(i);
			if ((tmp1 + tmp2) % k == 0) {
				check = true;
			}
		}
		if (!check) {
			b.add(a.get(i));
			a.remove(i);
		}
	}
}
