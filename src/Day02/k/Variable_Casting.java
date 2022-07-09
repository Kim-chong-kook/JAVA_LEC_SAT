package Day02.k;

public class Variable_Casting {
	//--자바 Application 시작점(Entry Point)
	public static void main(String args[]) { // ===== ●●●● void 위치만 지키면 된다.
		//--묵시적 형변환
		byte a = 127;
		short b = a; // short(2) > byte(1) 이기 때문이다.
		
		long c = 1000;
		float d = c; // 실수형은 정수형 보다 무조건 큼.
		
		System.out.println("long to float : " + d);
		c = 100;
		System.out.println("long to float : " + c);
		System.out.println("long to float : " + d); // --d값이 변하지 않아서 깊은 복사가 된 상태다.
		
		byte aa = 127;
		short bb = (byte)aa;
		System.out.println("short to byte(명시적) : " + bb); // 강제 형변환은 상위 bit를 잘라낸다. 그래서 작은 수는 변하지 않는다.
		
		// aa = 128; // ●●● byte aa = 126;는 2중 선언이라 에러남. // 또한 넘치는 값을 넣을때, 에러남
		bb = (byte)aa;
		System.out.println("short to byte(명시적) : " + bb);		
		
		//-------------------------------------------------------
		
		String tel = "010-2222-3333";
		String tel2 = "010122223333";
		int tel3 = 01022223333;
		
		System.out.println(tel3); // 0이 생략된다. 그래서 tel는 문자형으로 하는 것이 실무에 좋다.
		
		double aaa = 3.1415;
		int bbb = (int)aaa; // --- 실수에서 정수로 형변환시 소숫점 이하 버림(반올림 하지도 않는다.: 실수형의 구조에서 부호/지수/가수로 정수로 변환할때 가수가 버려진다.)
		System.out.println("double to float:" + bbb);
		
		// ==========================================================
		// ●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●
		// 파이썬이나 c, java나 모든 언어가 참조형 변수인 경우는 정체성이 주소전달이다.
		// 따라서, 숫자등의 기본형 변수(원시, primitive)인 경우는 변하지 않는다. 
		// 그러나, 앞자리 대문자형(4byte), 리스트, array, Class는 모두 참조형으로 주소를 전달한다.
		// 부울형은 소문자 true/false
		// 상수형은 final 대문자 변수;
		// 이스케입, 리터럴 시퀀스 : 개행문자 \n, \", \t, \r
		// 묵시적 형변환 : 특별히 할게 없다.
		// 강제적 형변환 : 작은 방 = (작은 방 자료형)큰 변수
		// (int)'A' 는 65의 값을 돌려준다.
		System.out.println("(int)'A' = " + (int)'A');
		// 주민번호는 13자리값이 있으므로 int는 10자리라서 실격, long를 선택해야 한다.
		// int regNo = 
		// long regNo = 7777771234567
		
		
		
		
		
		
		
		
	}

}
