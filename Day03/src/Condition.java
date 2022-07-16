
/*
 * 조건문 Condition
 * 1.if, 2. switch
 * if (조건식) {
 * }
 * --조건식 참일 경우만... 실행문 실행
 */
public class Condition {
	public static void main(String[] args) {
		//String condition = args[0];
		
		// Rus as Main/class와 Arguments 점수 입력 방식
		int gainedPoint = Integer.parseInt(args[0]); 
		
		// 임의방식
		gainedPoint = 89; 
		
		System.out.println("당신이 얻은 점수는 : " + gainedPoint +"점 입니다.");
		
		// ◆◆◆ if / else if 방식은 높은 수부터 좁게 조회 하도록 한다.
		if (gainedPoint >=90) {
			System.out.println("입사하세요.");
		} 
		else if (gainedPoint >=80) {
			System.out.println("인턴 3개월");
		} 
		else {
			System.out.println("집에 가세요.");
		}
		
		//=================삼항과 if else 비교
		int a =10; 
		boolean result = (a > 10) ? true: false;
		
		if (a >=10) {
			result = true;
		}
		else if (a >= 10) {
			result =false;
		}
		//=====================
		
	}
}
