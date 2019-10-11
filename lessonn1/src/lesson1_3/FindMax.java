package lesson1_3;

public class FindMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private static int findMax(int[] data, int begin, int end) {
		if (begin == end) {
			return data[begin];
		}
		else {
			return Math.max(data[begin], findMax(data, begin+1, end));
		}
	}
	private static int findMax2(int[] data, int begin, int end) {
		if (begin == end)
			return data[begin];
		else {
			int middle = (begin+end)/2;
			int max1 = findMax2(data, begin, middle);
			int max2 = findMax2(data, middle+1, end);
			return Math.max(max1, max2);
		}
	}
}
