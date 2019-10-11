package lessonn1;

public class Hello {

	public static void main(String[] args) {
		func(4);

	}

	private static void func(int n) {
		if (n <= 0)
			return;
		else {
			System.out.println("Hello...");
			func(n-1);
		}
			
	}


		
	

}
