import java.util.*;

public class Service_lane {

	// perfecto
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		List<Integer> l = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			l.add(sc.nextInt());
		}
		for (int j = 0; j < t; j++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			Comparator<Integer> cmp = Comparator.naturalOrder();
			System.out.println(l.subList(a, b + 1).stream().min(cmp).get());
		}
		sc.close();
	}

}
