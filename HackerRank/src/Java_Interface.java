
interface AdvancedArithmetic {
	public abstract int divisorSum(int n);
}

// perfecto
class MyCalculator implements AdvancedArithmetic {
	public MyCalculator() {
	}

	public int divisorSum(int n) {
		int suma = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				suma += i;
			}
		}
		return suma;
	}
}