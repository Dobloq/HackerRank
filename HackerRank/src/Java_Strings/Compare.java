package Java_Strings;
import java.util.*;

public class Compare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		int n = sc.nextInt();
		List<String> lista = new ArrayList<>();
		for (int i = 0; i < a.length() - (n - 1); i++) {
			lista.add(a.substring(i, i + n));
		}
		lista.sort(Comparator.naturalOrder());
		System.out.println(lista.get(0));
		System.out.println(lista.get(lista.size() - 1));
	}
}