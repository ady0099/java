package Day0323hw;

public class P17_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//num[1] = 10;
		//num[2] = 100;
		//num[3] = 1000;
		//num[4] = 10000;
		
		int[] num = new int[5]; // 인덱스는 0번부터 시작하므로 최소 5개,
								//할당하지 않은 int[] 기본 값은 0
		
		int j = 1;	
		
		
		for(int i = 1; i<5; i++)
		{
			j = j * 10;
			num[i] = j;
			
			
		}
		
		
		
		
			
	}

}
