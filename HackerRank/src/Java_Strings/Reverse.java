package Java_Strings;
import java.util.*;

public class Reverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = "";
		for (int i = a.length() - 1; i >= 0; i--) {
			b += a.charAt(i);
		}
		if (a.compareTo(b) == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}