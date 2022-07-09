package Day02.k;

public class VariableLec_string {
	public static void main(String[] args) {
		
		char alpha = '김'; // 문자형은 '' 싱글 쿼테이션
						  // char 기본 데이터 타입
		String name = "김종국"; // 문자열은 "" 더블 쿼테이션
							 // 참조 데이터 타입, 대문자형, Class
		System.out.println("나의 이름은 "  +  name + "입니다.");
		
		name = "     ";
		name = "";
		
		// 숫자건 문자건 실수건 "" 감싸져 있는 경우는 문자열로 인식한다.
		String float_value = "1.5f";
		// char aaa = "B"; // 문자열이기 때문에 문자 B는 char aaa에 담아지지 않는다.
		char bbb = 'B';
		
		String message = "너의 점수는 " + 90 + "점 입니다."; // 숫자 90은 문자화된 90이다.
		System.out.println(message);
		
		System.out.println(message.indexOf("점수") + "번째 부터 시작"); // 앞으로 배울것.............
		
		// --변수/상수
		int i = 10;
		System.out.println("변수 i = " + i);
		i = 100;
		System.out.println("변수 i = " + i);
		
		int ii = 10;
		System.out.println("변수 i = " + ii);
		int iii = ii;
		System.out.println("변수 i = " + iii);
		
	}

}
