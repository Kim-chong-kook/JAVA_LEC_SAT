import java.util.Arrays;

public class GooGoo_ArrayAct {
	public static void main(String [] args) {

			for (int i = 1; i < 10; i++) {
				int[] answer = GooGoo_Array.calculate(i);
				System.out.println(i + "단: " + Arrays.toString(answer));
			}
		
	}
}
