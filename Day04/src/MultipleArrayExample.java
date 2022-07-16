
public class MultipleArrayExample {

	public static void main(String[] args) {
		// 1원 배열 선언
		int[] arrInt = new int[5];
		
		// 한층에 방5개 짜리, 3층 건물을 지어 보자.
		//int[][] arrIntMulti = new int[3][5];
		// arrIntMulti 스택 : 주소형 4byte 힙
		// 1차원 배열     힙 : 주소형 4byte씩 *3 = 12byte 소요됨.
		// 2차원 배열(실제)힙 : 자료형 byte * 15개 = 15byte 쇼요됨( ★ 본체 자료형의 byte만큼 )
		
		// byte 자료형 힙= 1byte
		// char 자료형 힙= 2byte
		// int  자료형 힙= 4byte
		// 총메모리 = 계산된 메모리에 /8해서 나눠 떨어지지 않으면, 추가 padding
		
		//생성 후 따로 넣기
		int[][] arrIntMulti = new int[3][5];
		arrIntMulti[0][0] = 1;
		arrIntMulti[0][1] = 100;
		
		// 생성과 동시에 방에 데이터 넣기.
		int[] arrInt2 = {10,20,30}; // 1차원 배열
		int[][] arrIntMulti2 = { // 방수를 지정하지 않았음.
				{1,2,3,4},
				{2,3,4},
				{4,5,6}
		};
		
		// 2차원 배열까지만 쓰세용~~~~~3차원 넘으면 각방의 값을 파악하기 어려움.
		
		int[][] a = new int[3][5]; // 방수를 지정했기 때문에 정해진 양.
		// 변수a의 주소는 3개, [3]의 주소는 5개.
		for(int x=0; x<a.length; x++) {
			for(int y=0; y<a[x].length; y++) {
				System.out.print(a.length+" "); 
				System.out.print(a[x].length+" ");  
				
				a[x][y] = x*y;
				System.out.println(a[x][y]);
				
			}
			
			
		}
		
	}

}
