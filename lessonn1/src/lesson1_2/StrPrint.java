package lesson1_2;

public class StrPrint {

	public static void main(String[] args) {
		strPrint("Test");

	}
	// lecture note
	private static void strPrint(String string) {
		if (string.length() == 0)
			return;
		else {
			System.out.print(string.charAt(0));
			strPrint(string.substring(1));
		}
		
	}
	
	//It's mine
//	private static String strPrint(String string) {
//		if (string.equals(""))
//			return "";
//		else
//			return string.substring(0, 1) + string.substring(1);
//	}

}
