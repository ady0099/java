package Day0323hw;

public class P16_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a; // 배열선언  스택메모리 참조 타입
		a = new int[10]; // 힙메모리 10개 생성
		int sum = 0;
		
		
		for (int i =0; i<6; i++)
		{
			a[i]=i+1;
			sum = sum + a[i];
			
			System.out.println(sum);
		}
		
		//System.out.println(a); //0x100
		//System.out.println(a[0]);
		//System.out.println(a[1]);
		
	
		
		
		
		
		
		
	}

}
