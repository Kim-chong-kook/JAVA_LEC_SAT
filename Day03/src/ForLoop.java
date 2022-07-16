

/* for(초기화식; 조건식; 증감식){
 * ...실행부
 * }
 * 
 */
public class ForLoop {
	public static void main(String[] args) {
		for(int i = 1;i<=10;i++) {
			System.out.println(i);
		}
		
		int x;
		for (x=1;x<=10;x++) {
			System.out.println(x); // x가 11이 되면 빠져나간다.
		}
		System.out.println("x = " + x); // x가 증감식에서 11까지 연산함.
		
		
		int y = 1;
		for (;y<=10;y++) {
			
		}
		
		for (;y <=10; ) {
			System.out.println(y);
			y++;
		}
		
		for (;;) { //무한루프
			System.out.println(y);
			y++;
			if(y>10) break;
			
		}
		
		for (;;) { //무한루프
			System.out.println(y++);
			//y++;
			if(y>10) break;
			
		}
		
		// 중첩된 for문
		// 구구단
		// 2단 ~ 9단까지
		// x * y -> x결정
		// 구구단에서 1~9까지 곱하는건 너무 많다.
		// 나는 1~5까지만 곱할래
		// 조건식을 바꾸지 않고
		System.out.println("===== 구구단 ======");
		
		for(int x1 = 2; x1 <=9; x1 ++) { // x결정됨
			System.out.println("===== " + x1 + "단 ========");
			if(x1 == 6) break; // 6단 탈출문
			
			if(x1%2 != 0) continue; // 증감문으로 이동 / 짝수단만 실행 / 하부실행하지 않음.
			
			for(int y1 = 1; y1 <=9; y1++) { // y축 결정
				System.out.println(x1 + " x " + y1 + " = " + (x1 * y1));
				
			}
		}
		
		
		
	}
}
