

/* while / do while
 * while(조건식){
 * 	조건식이 참일때, 반복실행
 * }
 * 
 * do {
 *  실행하고나서 조건식이 참일때, 반복실행 : 최소 한번은 실행.
 * } while(조건식);
 */
public class WhileLoop {
	public static void main(String[] args) {
		
		boolean goLoop = false;
		
		// while 문
		while(goLoop) {
			System.out.println("고고");
		}
		
		// do while 문은 한번은 실행함.
		do {
			System.out.println("허헉");
		} while(goLoop);
		
		
		int x = 10;
		while(x<20) {
			System.out.println(x);
			System.out.println(x++); // 무한반복 깨기. x실행 => x후위 증가
			if(x==20) break; // 무한반복 깨기
		}
		
		
		// 구구단 가로줄이 끝나야 println("2*9 =" + 18)
		// println("3*1 =" + 18)
	}
}
