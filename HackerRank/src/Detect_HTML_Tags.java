import java.util.*;
import java.util.regex.*;

public class Detect_HTML_Tags {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SortedSet<String> tags = new TreeSet<>();
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			String line = sc.nextLine();
			Pattern patron = Pattern.compile("</.+>");
			Matcher match = patron.matcher(line);
			if (match.find()) {
				String tmp = match.group();
				String[] a = tmp.split(">");
				for (int j = 0; j < a.length; j++) {
					tags.add(a[j].substring(2, a[j].length()));
				}
			}
		}
		Iterator<String> it = tags.iterator();
		while (it.hasNext()) {
			String next = it.next();
			if (it.hasNext() == false) {
				System.out.print(next);
			} else {
				System.out.print(next + ";");
			}
		}
	}
}