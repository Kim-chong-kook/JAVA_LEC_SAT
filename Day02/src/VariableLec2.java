
// 변수공부

public class VariableLec2 { // 클래스 선언부. 파일명과 동일하게 해야 한다.
	public static void main(String[] args) { // 자바 어플리케이션 스타팅 포인트
		System.out.println("Hello Var!");
		int score = 10;
		// int score; // = 10;
		System.out.println(score);
		// -- 1.변수명은 영어,숫자,특수문자,한글사용가능(억제, 지양하자)
		// int Age;
		int age; // 변수의 시작은 소문자를 원칙.
		// int aGe;
		int student4Age; // 숮자도 사용 가능
		int student4_age; // 특수문자도 가능
		int $_age; // 특수문자로 시작할 수 있음.
		
		//--2.변수명은 숫자로 시작할 수 없다.
		// int 4Age; // -- @@@ 숫자시작은 컴파일 에러 발생
		
		// --3. 공백사용 불가
		// int student age; // @@@
		int studentAge; // ●●● 모범답안
		int student_age;
		
		// --4.대소문자 구분
		int studentAge2; // ★★★ 모범적이나 숫자의 의미가 없다.
		int studentage2; // @@@ 각기 다른 변수들이다. 소문자 age는 가독성이 낮다.
		
	
		// --5.예약어는 변수명 불가
		// int static; // @@@ 예약어를 사용한 변수는 에러
		
		//--6. 의미를 부여하자
		int a = 40; // -- @@@ 의미없는 변수는 나중에 알기 어렵다.
		int friendAge = 40; // ●●●좋은 사례이다.
		
		// 변수가 담을 수 있는 범위
		char alpha  = 65;
		System.out.println(alpha + ":" + (char)alpha);
		System.out.println((int)alpha + "=" + alpha);
		System.out.println("========================================================");
		for(char i=65; i<=90; i++) {
			System.out.println(i + "=" + (int)i);
		}
		
		// ●●●●●●●●●●●●●●진로방향 잡기●●●●●●●●●●●●
		String a1;
		String adress1 = "https://roadmap.sh/java" ;
		String adress2 = "https://roadmap.sh/frontend" ;
		System.out.println("프런트엔드 =" + adress2); // 이종석 강사님 초기의 추천방향
		System.out.println("백앤드 =" + adress1); // 롱런할 방향, 프런트엔드에서 넘어오기도 한다.
		
		//java는 메모리를 직접관리할 수 없다.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}