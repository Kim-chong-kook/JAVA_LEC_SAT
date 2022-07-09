

public class InitialExample { // 추천 : 웹 풀스택https://sesac.seoul.kr/course/active/detail.do?courseActiveSeq=1417&srchCategoryTypeCd=&courseMasterSeq=234&currentMenuId=900001001

	public static void main(String[] args) {
		int x = 10;
		int y = 11;
		System.out.println("x+y = :" + (x+y));
		System.out.println("x-y = :" + (x-y));
		System.out.println("x*y = :" + (x*y));
		System.out.println("x/y = :" + (x/y)); // 정수/정수 = 정수
		
		System.out.println("x / 10.1 = " + (x/10.1)); // 정수 / 실수 = 큰쪽 데이터 type : double
		
		System.out.println(11%10);
		System.out.println("나의 집은 시흥대로 " + (100+52) + "길 입니다."); // (괄호연산자가 우선순위를 올린다.)
		System.out.println("나의 집은 시흥대로 " + 100 / 52 + "길 입니다."); // *,/가 +,-보다 우선순위가 높다.
		
		// C계열의 언어에서 작동.
		int b = 100; // 단순 할당
		b += 10; // b = b + 10;
		System.out.println(b);
		b -= 10; // b = b - 10;
		System.out.println(b);
		b *= 10; // b = b * 10;
		System.out.println(b);
		b /= 100; // b = b / 100;
		System.out.println(b);
		b %= 100; // b = b % 100;
		System.out.println(b);

	}

}
