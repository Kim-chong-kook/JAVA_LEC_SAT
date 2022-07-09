
/** 고정적인 것이 i, 계속 변하는 것이 j
 * 
 */
public class GooGoo_Garo {

	public static void main(String[] args) {
		for(int i=1; i<=9; i++){ // 실행순서를 고려하면 V형이 된다.
			System.out.print("["+i+"단]\t"); // 줄바뀜 없이 \t 칸 간격 벌림
		}
		System.out.println(); // 줄바뀜
		for(int i=1; i<=9; i++){
			for(int j=1; j<=9; j++){
				System.out.print(j+"*"+i+"="+j*i+"\t");
			}
			System.out.println(); // 줄바뀜
			
		}
	}

}
