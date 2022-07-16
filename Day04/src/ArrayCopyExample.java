import java.util.Arrays;

/**
 * 배열복사
 * @author TJ
 *
 * 배열복사 이유
 * 1. 방을 넓히거나 줄일 목적
 * 2. 참조변수이기 때문에 다른 프로세스(작업)에 여양을 받을 수 있기 때문에 
 *    그 영향도를 없애고 독립적으로 사용하려고. 
 */
public class ArrayCopyExample {

	public static void main(String[] args) throws InterruptedException {
		
		// 1번 목적 : for문으로 하나씩 이전.
		// 학생이 5명인 학교
		// 5명의 학생의 점수를 입력
		int stdScores[] = {90,80,70,60,50};
		for(int i =0; i<stdScores.length;i++) {
			System.out.println(i+"번째 학생 점수 :" +stdScores[i]+"점");;
		}
		// --  오늘 한명이 전학을 와서 시험을 봤다.
		// -- 80점 획득.
		// stdScores <-- 학생 방이 5개만 있다.
		// -- 앞으로 늘어날 수도 있으니, stdScores2라는 10개의 방에 있는 집을 만들어서 이사가자.
		
		// A. for문으로 복사하기>>
		int stdScores2[] = new int[10];
		int i=0;
		for( ;i<stdScores.length;i++) {
			stdScores2[i] = stdScores[i];
		}
		stdScores2[i] = 80;
		
		Thread.sleep(1500);
		System.out.println("\n#######이사완료#######");
		for(int x=0 ;x <stdScores2.length;x++) { //stdScores.length에 추가된 만큼만
			
			if(stdScores2[x] == 0) break; // 이것은 0점받은 학생이 있을 위험.
			System.out.println(x+"번째 학생점수 :"+ stdScores2[x] + "점");
		}
		
		// B. System.arrayCopy() : 단점은 방을 만들어 놓고 이전하는 점이다.
		// https://devdocs.io/openjdk~11/
		//학생 3명이 있는 학교 schoolStdA에 학생 "괭이"가 전학을 왔어요.
		
		
		
		//--Src (Source) 원본
		String[] schoolAStds = {"이종석","하악이","뿅뿅이"};
		
		//--Dest. 복사할 대상
		String[] schoolBStds = new String[10];
		System.arraycopy(schoolAStds, 0, schoolBStds, 0, schoolAStds.length);
		//####################################################################
		// .arraycopy(원본, 원본 시작 index, 타겟, 타겟 시작 index, 원본의 길이);
		//####################################################################
		
		schoolBStds[3] = "괭이";
		System.out.println("\n#### 학생출력 ######");
		for(int x=0; x< schoolBStds.length; x++) {
			System.out.println(x+"번째 학생"+schoolBStds[x]);
		}
		
		// C. Arrays.copyOf
		String[] schoolCStds = Arrays.copyOf(schoolBStds, 20);
		// 대상배열 변수 = Arrays.coopyOf(원본배열, 새 배열의 총길이)
		System.out.println("\n#### 학생출력 ######");
		for(int x=0; x< schoolCStds.length; x++) {
			System.out.println(x+"번째 학생"+schoolCStds[x]);
		}
		
		
		
	}
}
