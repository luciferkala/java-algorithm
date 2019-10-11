package lesson1_2;

public class PrintInBinary {

	public static void main(String[] args) {
		printInBinary(64);

	}

	private static void printInBinary(int n) {
		if (n < 2)
			System.out.print(n%2);
		else {
			printInBinary(n/2);
			System.out.print(n % 2);
		}
		
	}

}
