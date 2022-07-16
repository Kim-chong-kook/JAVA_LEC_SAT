

public class VariableLec8 {
	public static void main(String args[]) {
		//-- 선언과 동시에 초기화
		int a = 10;
		char b = 20;
		short c = 100;
		long d = 1000;
		
		// -- 선언과 초기화를 별도로
		int aa;
		char bb;
		short cc;
		long dd;				
		
		aa = 10;
		bb = 20;
		cc = 100;
		dd = 1000;			
		
		int aaa;
		aaa = 100; //--초기화가 되야 한다.
		System.out.println(aaa); // 초기화 하지 않는 값 aaa 는 에러
		
		// 선언방식 2
		int aaaa, bbbb, cccc, dddd;
		char aaaa_c,bbbb_c, dddd_c;
		
		byte testCharLength;
		// testCharLength = 128; // 데이터 타입 한도가 127까지므로 에러
		
		testCharLength = 127; // 127까지므로 에러
		testCharLength ++; // 변수별 범위한도를 넘어가 버리므로 에러가 나지 않고, 다시 처음의 한도값 -128을 표기한다.
		System.out.println(testCharLength);
	}

}
