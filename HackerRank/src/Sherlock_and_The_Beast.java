import java.util.Scanner;

public class Sherlock_and_The_Beast {

	// funciona pero poco optimo
	// la solucion propuesta por la web es probar si entre los numeros con las
	// cifras dadas hay algun posible

	// We can solve this problem using a semi-brute-force method by using
	// maximum number of five such that number of five is divisible by 3.
	// In layman's terms, we will see if `NN` is divisible by 3. If not, we will
	// check for all `ii` whether `N−iN−i` is divisible by `33` and `ii` by
	// `55`. The first `ii` to satisfy these conditions will be the number of
	// threes and `N−iN−i` the number of fives.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int casos = sc.nextInt();
		for (int i = 0; i < casos; i++) {
			int cifras = sc.nextInt();
			String numero = "";
			String fin = "";
			for (int j = 0; j < cifras; j++) {
				numero += "5";
				fin += "3";
			}
			if (checkNum(numero)) {
				System.out.println(numero);
			} else {
				boolean b = false;
				do {
					numero = cambiarNum(numero);
					b = checkNum(numero);
					if (checkNum(numero)) {
						System.out.println(numero);
						break;
					}
					if (numero.equals(fin)) {
						if (checkNum(numero)) {
							System.out.println(numero);
							break;
						}
						System.out.println(-1);
						break;
					}
				} while (!b);
			}
		}
		sc.close();
	}

	private static Boolean checkNum(String n) {
		Boolean res = false;
		int n3 = 0;
		int n5 = 0;
		for (int i = 0; i < n.length(); i++) {
			Character b = (Character) n.charAt(i);
			if (b.equals('3')) {
				n3++;
			} else if (b.equals('5')) {
				n5++;
			}
		}
		if (n3 % 5 == 0 && n5 % 3 == 0 && (n3 != 0 || n5 != 0)) {
			res = true;
		}
		return res;
	}

	private static String cambiarNum(String s) {
		int pos = s.indexOf("3");
		if (pos == -1) {
			s = s.substring(0, s.length() - 1) + "3";
		} else {
			s = s.substring(0, pos - 1) + "3" + s.substring(pos);
		}
		return s;
	}
}
