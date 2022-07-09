package Day03.k;

public class Make_PlayHill {
	public static void main(String[] args) {
		int age = 10;
		int height = 156;
		// String heartDease="no"; // !heartDease으로?
		boolean heartDease=false; // !heartDease으로?
		
		if ((age >=6) && (height >= 120) && (!heartDease)) { // if (괄호) 문법 { }
			System.out.println("탑승가능합니다.");
			
		}
		else {
			System.out.println("탑승불가");
		}
	}
}
