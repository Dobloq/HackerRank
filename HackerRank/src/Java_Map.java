import java.util.*;

public class Java_Map {

	// 1 timeout 4 aceptados
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		SortedMap<String, Integer> list = new TreeMap<String, Integer>();
		for (int i = 0; i < t; i++) {
			list.put(sc.nextLine(), sc.nextInt());
			sc.nextLine();
		}
		while (sc.hasNext()) {
			String query = sc.nextLine();
			Integer res = list.get(query);
			if (res == null) {
				System.out.println("Not found");
			} else {
				System.out.println(query + "=" + list.get(query));
			}
		}
		sc.close();
	}

}
