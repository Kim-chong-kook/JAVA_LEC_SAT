package Day02.k;

public class VariableLec02 {
	public static void main(String args[]) { // []는 배열이며 위치는 상관없다.
		
		if(args.length <2) {
			System.out.println("사용법 : java VariableLec02 [배열] 연습입니다.");
			return;
		}
		
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		
		System.out.println(x + "+" + y + "=" + (x+y));
		// 우클릭 메뉴의 Run As / Run Configuration 에서 Arguments / Program arguments에서 10 20 을 넣어 준다.
		// 한글로 인한 에러발생시 상위폴더의 bin속으로 Dos창으로 해당 폴터로 이동하여 실행할 수도 있다.
		// java VariableLec02 10 200
		
		
		
		
	}

}
