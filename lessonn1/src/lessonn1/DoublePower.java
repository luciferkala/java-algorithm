package lessonn1;

public class DoublePower {

	public static void main(String[] args) {
		System.out.println(dPow(2 , 5));

	}

	private static double dPow(double x, int n) {
		if (n == 0)
			return 1;
		else
			return x * dPow(x, n-1);
	}

}
