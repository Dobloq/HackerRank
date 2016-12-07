import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;
import java.security.Permission;

class Calculate {
	Volumen output = new Volumen();
	static Scanner sc = new Scanner(System.in);

	public int getINTVal() throws IOException {
		int valor = sc.nextInt();
		if (valor <= 0) {
			throw new NumberFormatException("All the values must be positive");
		} else {
			return valor;
		}
	}

	public static Volumen get_Vol() {
		return new Volumen();
	}

	public double getDoubleVal() throws IOException {
		double valor = sc.nextDouble();
		if (valor <= 0) {
			throw new NumberFormatException("All the values must be positive");
		} else {
			return valor;
		}
	}
}

class Volumen {
	public static Double main(int a) {
		return (double) (a * a * a);
	}

	public static Double main(int l, int b, int h) {
		return (double) (l * b * h);
	}

	public double main(double r) {
		return (2 * Math.PI * r * r * r) / 3;
	}

	public double main(double r, double h) {
		return Math.PI * r * r * h;
	}

	public void display(double volume) {
		System.out.println(String.format("%.3f", volume));
	}

}

public class Calculating_volume {

	public static void main(String[] args) {
		Do_Not_Terminate.forbidExit();
		try {
			Calculate cal = new Calculate();
			int T = cal.getINTVal();
			while (T-- > 0) {
				double volume = 0.0d;
				int ch = cal.getINTVal();
				if (ch == 1) {

					int a = cal.getINTVal();
					volume = Calculate.get_Vol().main(a);

				} else if (ch == 2) {

					int l = cal.getINTVal();
					int b = cal.getINTVal();
					int h = cal.getINTVal();
					volume = Calculate.get_Vol().main(l, b, h);

				} else if (ch == 3) {

					double r = cal.getDoubleVal();
					volume = Calculate.get_Vol().main(r);

				} else if (ch == 4) {

					double r = cal.getDoubleVal();
					double h = cal.getDoubleVal();
					volume = Calculate.get_Vol().main(r, h);

				}
				cal.output.display(volume);
			}

		} catch (NumberFormatException e) {
			System.out.print(e);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Do_Not_Terminate.ExitTrappedException e) {
			System.out.println("Unsuccessful Termination!!");
		}

	}
}

/**
 * This class prevents the user from using System.exit(0) from terminating the
 * program abnormally.
 */
class Do_Not_Terminate {

	public static class ExitTrappedException extends SecurityException {
	}

	public static void forbidExit() {
		final SecurityManager securityManager = new SecurityManager() {
			@Override
			public void checkPermission(Permission permission) {
				if (permission.getName().contains("exitVM")) {
					throw new ExitTrappedException();
				}
			}
		};
		System.setSecurityManager(securityManager);
	}
}