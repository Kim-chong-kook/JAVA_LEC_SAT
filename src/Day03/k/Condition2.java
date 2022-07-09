package Day03.k;

/**
 * Switch 문
 * @author TJ
 * switch(변수/값){
 * case 값:
 *  	...실행문;
 *  	break;
 * case 값:
 *  	...실행문;
 *  	break;
 * default:
 * 		...실행문;
 */
public class Condition2 {
	public static void main(String[] args) {
		
		int a = 10;
		switch(a) { // 딱떨어지는 ==일때만, 사용가능. 범위는 사용불가.
		case 5:
			System.out.println("5입니다");
			break; // 넣지 않으면 한번만 비교하고 맞으면 그 밑으로 모두 실행
		case 10:
			System.out.println("10입니다.");
			break;
		default:
			System.out.println("맞는 숫자가 없습니다.");
		
			// if else if로 변경가능하다. // 이것은 자유로운 범위 입력 가능
			
		if(a==5) {
			
		}
		else if(a==10) {
			
		}
		else {
			
		}
		}
	}
}
