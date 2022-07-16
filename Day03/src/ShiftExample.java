

/* 
 * 쉬프트 연산
 * << 좌측으로 쉬프트
 * 1 << 3 -> 0000 0001
 *        -> 0000 1xxx (3칸 이동)
 *        -> 0000 1000
 *        -> 좌측 쉬프트는 추가된 우측 비트에 0을 채운다.
 */

public class ShiftExample {

	public static void main(String[] args) {
		int x = 2;
		System.out.println(Integer.toBinaryString(x));
		x = x << 2;
		System.out.println("x << 2 = " + x);
		System.out.println(Integer.toBinaryString(x));
		x = 2;
		x = x << 3;
		System.out.println("x << 3 = " + x);
		System.out.println(Integer.toBinaryString(x));
		
		// Right Shift
		// >>
		// 부호비트는 채워준다.
		x =  -1;
		System.out.println(Integer.toBinaryString(x));
		
		x = x >> 10;
		System.out.println(Integer.toBinaryString(x));
		System.out.println("x >> 10 = " + x);
		
		
		System.out.println("=============================");
		x = -100;
		System.out.println(Integer.toBinaryString(x));
		x = x >> 3;
		System.out.println(Integer.toBinaryString(x));
		System.out.println("x >> 3 = " + x);
		
		
		System.out.println("=============================");
		x = 100;
		System.out.println(Integer.toBinaryString(x));
		x = x >> 3;
		System.out.println(Integer.toBinaryString(x));
		System.out.println("x >> 3 = " + x);
		
		// >>> Ringht Shift
		// 상위 비트를 무조건 0으로 채운다.
		System.out.println("=============================");
		x = -1;
		System.out.println(Integer.toBinaryString(x));
		x = x >>> 3;
		System.out.println(Integer.toBinaryString(x));
		System.out.println("x >> 3 = " + x);
		
	}

}
