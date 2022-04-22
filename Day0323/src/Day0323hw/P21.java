package Day0323hw;

import java.util.Scanner; // 자바.유틸.스캐너 -> 경로

public class P21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] intArr = new int[] { 1, 2, 3, 4, 5 };
		int i;
		
		System.out.println("초기화된 값 출력");
		for (i = 0; i < intArr.length; i++) {
			System.out.print(intArr[i]+"\t");
		}
		System.out.println();
	
		System.out.println("숫자 5개를 입력하시오");
		for (i = 0; i < intArr.length; i++) {
			intArr[i] = sc.nextInt();
		}
		
		System.out.println("배열에 저장된 값 출력");
		for (i = 0; i < intArr.length; i++) {
			System.out.print(intArr[i]+"\t");
		}
		
	}

}
