package Java_Strings;
import java.util.*;

public class Anagrams {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
		List<String> lista = Arrays.asList(a.toLowerCase().split(""));
		lista.sort(Comparator.naturalOrder());
		List<String> listb = Arrays.asList(b.toLowerCase().split(""));
		listb.sort(Comparator.naturalOrder());
		if (lista.equals(listb)) {
			System.out.println("Anagrams");
		} else {
			System.out.println("Not Anagrams");
		}
	}
}