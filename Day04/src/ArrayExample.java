
/**배열
  * @author TJ
 *
 * 배열의 선언방법
 * 1. 데이터타입[] 변수명 (int[] arrInt;)
 * 2. 데이터 타입 변수명[](int arrInt[];)
 */
// ● 배열, list, 컬렉션 API


public class ArrayExample {

	public static void main(String[] args) {
		int[] arrInt = new int[5]; // 메모리가 고정되어 있다. (가변배열 별도).
		// 1. 선언후 대입해야 4바이트 메모리 5개 할당. = 20바이트 할당(정보12byte+패딩byte는 제외하고 실제 데이터)
		
		// A. 방을 만들고 각호실에 데이터를 따로 입력
		arrInt[0] = 1; // 2. 각 호실에 값을 넣는다.
		arrInt[1] = 2; // 
		arrInt[2] = 3;
		arrInt[3] = 4;
		arrInt[4] = 5;
		// 호실(Index)은 배열길이 -1
		
		for(int i=0;i<arrInt.length;i++) {
			arrInt[i] = i;
		}
		
		// B. t선언과 동시에, 각 호실에 데이터를 한번에 입력하는 방식
		int arrInt2[] = {11,12,13,14,15};
		
		System.out.println(arrInt);
		System.out.println(arrInt[0]);
		System.out.println(arrInt2[1]);
		// System.out.println(arrInt[5]); // ArrayIndexOutOfBoundsException:에러
		
		// -- A - Z까지 char[] 넣어라.
		char[] alpha = new char[26];
		for(char i=0; i<alpha.length;i++) {
			alpha[i] = (char)(i+65);
		}
		for(int i =0;i<alpha.length;i++) {
			System.out.print((char)alpha[i]);
		}
		
		// ● 배열의 사용목적 : 같은 자료형의 별도의 변수선언을 피하고 일괄 값 부여.
		// 결과적으론 수백~수천개의 같은 데이터형의 유지/관리를 원할하게 하지만, 결국 값을 인지하기 어렵다.
		
		int stdScores[] = {90,80,88,90,80}; // dict타입으로 값을 일괄 넣는다.
		int totalScore = 0;
		for(int i=0;i<stdScores.length;i++) {
			totalScore += stdScores[i];
		}
		System.out.println();
		System.out.println("평균 = " + totalScore / 5);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
