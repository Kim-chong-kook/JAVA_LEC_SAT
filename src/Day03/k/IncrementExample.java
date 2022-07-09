package Day03.k;
/**
 * 증감연산
 * ++, --
 * 대표적인 단항연산
 * 피연산자 1개
 * ++x : x = x + 1
 * x++
 * --y : y = y - 1
 * y--
 * 
 */
// package src;
public class IncrementExample {

	public static void main(String[] args) {
		int a = 10;
		System.out.println(a);
		++a;
		System.out.println(a);
		
		// -- 증감연산자의 전위, 후위 수식
		// ++a: -- 피연산자의 앞에 수식이 붙는 경우
		// a--: 뒤에 수식이 붙는 경우
		// x = x+1
		
		a= 100;
		System.out.println();
	}

}
