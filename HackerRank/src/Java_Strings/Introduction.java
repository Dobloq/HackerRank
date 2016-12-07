package Java_Strings;
import java.util.*;

public class Introduction {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b;
		if (sc.hasNext()) {
			b = sc.nextLine();
		} else {
			b = a.substring(a.indexOf(" ")+1);
			a = a.split(" ")[0];
		}
		System.out.println(a.length() + b.length());
		
		if (a.compareTo(b) > 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		System.out.println(Character.toUpperCase(a.charAt(0)) + a.substring(1) + " "
				+ Character.toUpperCase(b.charAt(0)) + b.substring(1));
	}
}