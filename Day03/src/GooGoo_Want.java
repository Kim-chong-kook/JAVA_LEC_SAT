import java.util.Scanner;

public class GooGoo_Want {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 구구단을 숫자로 넣으세요.");
		
		int dan = sc.nextInt();
		System.out.println("[ " + dan + " 단 ]");
		
		for(int i = 1; i<=9; i++) {
			System.out.println(dan + "*" + i + " = " + dan * i);
		}
		

	}

}
