import java.util.Scanner;

public class ShelockAndTheBeast2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int casos = sc.nextInt();
		for (int i = 0; i < casos; i++) {
			int n = sc.nextInt();
			System.out.println(check(n));
		}
		
	}
	
	private static String check(int n) {
		if (n < 3) {
			return "-1";
		} else if (n >= 3 && n < 5) {
			return "555";
		} else if (n >= 5 && n < 8) {
			return "33333";
		} else {
			String res = "";
			if (n % 3 == 0) {
				for (int i = 0; i < n / 3; i++) {
					res += "555";
				}
			} else {
				for (int i = 0; i < n / 5; i++) {
					res += "555";
				}
				for (int i = 0; i < (n % 5); i++) {
					res += "33333";
				}
			}if (res.length()>n) {
				return new Integer(-1).toString();
			} else {
				return res;
			}
			
		}
	}

}
