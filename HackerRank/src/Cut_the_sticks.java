import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Cut_the_sticks {

	// perfecto
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		List<Integer> l = new ArrayList<>();
		for (int i = 0; i < t; i++) {
			l.add(sc.nextInt());
		}
		do {
			int min = min(l);
			for (int i = 0; i < l.size(); i++) {
				l.set(i, l.get(i) - min);
			}
			System.out.println(l.size());
			for (int i = 0; i < l.size(); i++) {
				if (l.get(i) == 0) {
					l.remove(i);
					i--;
				}
			}
		} while (l.size() >= 1);
		sc.close();
	}

	private static Integer min(List<Integer> l) {
		Stream<Integer> str = l.stream();
		Comparator<Integer> cmp = Comparator.naturalOrder();
		return str.min(cmp).get();
	}
}
