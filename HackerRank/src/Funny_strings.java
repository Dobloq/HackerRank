import java.util.Scanner;

public class Funny_strings {

	// funciona para length = 4, pero necesita para mayor length
	// error de enfoque, se restan la mitad del string, no por parejas
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int casos = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < casos; i++) {
			String s = sc.nextLine();
			String s1 = s.substring(0, s.length() / 2);
			String s2 = s.substring(s.length() / 2);
			int suma1 = 0;
			int suma2 = 0;
			for (int j = 1; j < s1.length(); j++) {
				suma1 += Math.abs(s1.codePointAt(j));
			}
			for (int j = 1; j < s2.length(); j++) {
				suma2 += Math.abs(s2.codePointAt(j));
			}
			if (suma1 - Math.abs(s1.codePointAt(0)) == suma2 - Math.abs(s2.codePointAt(0))) {
				System.out.println("Funny");
			} else {
				System.out.println("Not Funny");
			}
		}
		sc.close();
	}

}
