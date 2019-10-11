package lessonn1;

public class SmartGcd {

	public static void main(String[] args) {
		System.out.println(smartGcd(500, 125));

	}

	private static int smartGcd(int m, int n) {
		if (n == 0)
			return m;
		else
			return smartGcd(n, m%n); 
	}

}
/*
 	smartGcd(int m, int n) => m과 n의 최대공약수를 구하는 함수
 	최대공약수는 호제법으로 구하며, m % n을 했을 때, 나누어 떨어지면 n이 최대공약수.
 	아니라면 n과 m%n과 다시 시도.
 	
	smartGcd가 무한루프에 빠지지 않는 이유
	1. m 과 n이 나누어 떨어질 때, (m % n == 0 일떄, n == 0)
		문제의 정의에 따라 답은 m이 출력 됨 
	2. smartGcd는 m과 n의 최대공약수를 구하는 것인데, 

*/