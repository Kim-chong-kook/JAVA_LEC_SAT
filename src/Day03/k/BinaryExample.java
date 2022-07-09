package Day03.k;

public class BinaryExample {
	public static void main(String[] args) { // int를 &,|로 논리계산하므로 자동으로 2진수의 논리값을 계산해 d십진수로 돌려준다.
		int x =2;
		System.out.println(Integer.toBinaryString(x)); // 인티져 x를 2진수 문자열로 바궈주는 메서드
		int y =3;
		System.out.println("x & y = " + (x & y));
		
		// 2를 2진수로 0010
		// 3을 2진수로 0011
		// x & y =   0010 = 2
		
		System.out.println("x | y = " + (x | y));
		// 2를 2진수로 0010
		// 3을 2진수로 0011
		// x | y =   0011 = 3
		
		System.out.println("x ^ y = " + (x ^ y));
		// 2를 2진수로 0010
		// 3을 2진수로 0011
		// x ^ y =   0001 = 1
	}
}
