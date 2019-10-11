package lesson1_2;

public class PrintCharReverse {

	public static void main(String[] args) {
		printCharReverse("test");

	}

	private static void printCharReverse(String string) {
		if (string.length() == 0)
			return;
		else {
			printCharReverse(string.substring(1));
			System.out.print(string.charAt(0));
		}
			
		
	}

}
