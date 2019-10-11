package lesson1_2;

import java.util.Scanner;

public class ReadFrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void readFrom(int n, int [] data, Scanner in) {
		if (n==0)
			return;
		else {
			readFrom(n-1, data , in);
			data[n-1] = in.nextInt();
		}
			
	}
}
