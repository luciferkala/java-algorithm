package lesson1_2;

public class Length {

	public static void main(String[] args) {
		System.out.println(length("Test"));

	}

	private static int length(String string) {
		if (string.equals(""))
			return 0;
		else 
			return 1 + length(string.substring(1));
	}

}
