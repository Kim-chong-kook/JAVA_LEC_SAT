package Day03.k;

public class LogicalExample {

	public static void main(String[] args) {
		int a = 10;
		int b = 11;
		int c = 15;
		int d = 3;
		
		boolean result = a>b;
		result = result && c > d;
		result = false && true;
		
		// And 연산은 두 항이 모두 참일때만 참
		result = true && true; 
		System.out.println("결과는 " + result);
		// OR 연산은 두 항 중 하나만 참이어도 참
		result = true || false;
		System.out.println("결과는 " + result);
		// XOR 연산은 두 항 중 하나만 참이어야 참
		result = true ^ false;
		System.out.println("결과는 " + result);
		// Not ! : 단항
		result = false;
		System.out.println(!result); // 출력에 넣어도 된다.
		System.out.println(!( 10 > 1)); // !참. = false
		
		// &&, ||는 앞쪽을 계산하고 로직에 따라 확실하면, 뒤쪽계산 생략. ==>속도 차이.
		// &, |는 앞쪽 뒤쪽 계산 수행.
	}

}
