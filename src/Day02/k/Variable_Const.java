package Day02.k;

public class Variable_Const {
	public static void main(String[] args) {
		//--변수선언
		int var_age = 50;
		var_age = 100; //-- 변수는 변할수 있는 값(수)
		var_age = -100; // -- 값이 변하더라도 오류없다.
		
		//--상수는
		final int MAX_AGE = 1000; //-- ●●● 상수는 final 키워드 사용 / 선언과 동시에 초기화 한다. / 변경하지 않게 할때 사용한다.
		// MAX_AGE = 100; //-- 상수는 변경 불가
		
		final int MAX_HEIGHT; // 이런 방식은 사용치 않는다.
		MAX_HEIGHT = 180;
		
		System.out.println(MAX_HEIGHT);
		
		final double PI = 3.141592;
		//PI = 4.5; //변경시 에러
	}

}
