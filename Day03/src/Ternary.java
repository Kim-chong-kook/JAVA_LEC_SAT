

public class Ternary { // 삼항연산
public static void main(String[] args) {
	int point = 90; // 컷라인
	int gainedPoint = 80; // 얻은 점수
	int isPassed = 0; // Pass 여부, 0이면 fail, 1이면 passed
	String isPassedString = "";
	
	isPassed = gainedPoint >= point ? (1+10) : 0; // 실행란에 연산(조건비교)도 가능하다.
	isPassedString = isPassed == 0 ? "불합격" : "합격";
	System.out.println("선생님은 " + isPassed + "하셨습니다.");
	System.out.println("선생님은 " + isPassedString + " 하셨습니다.");
}
}
