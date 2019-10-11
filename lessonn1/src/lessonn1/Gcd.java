package lessonn1;

public class Gcd {

	public static void main(String[] args) {
		System.out.println(gcd(100, 527));

	}

	private static double gcd(int m, int n) {
		if (m < n) {
			int tmp = m;
			m = n;
			n = tmp;
		} 
		
		if (m % n == 0) {
			return n;
		} else {
			return gcd(n, m%n);
		}
			
	}

}
