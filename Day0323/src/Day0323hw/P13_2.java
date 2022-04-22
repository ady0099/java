package Day0323hw;

public class P13_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// P13
		
		int[] num2 = new int[10];
		int j2 = 1;
		for ( int i = 0; i<10; i++)
		{
			num2[i] = j2;// num2[0]=1//num[1]=10
			j2=j2*10;
					
			int sum = 0;
			sum = sum + num2[i];
					
		}
				
			if ( num2[0] > num2[1])
			{
				System.out.println(0);
			}
				
			else if ( num2[0] == num2[1])
			{
				System.out.println("같은 경우");
			}
					
			else 
			{
				System.out.println(1);	
			}
				
			//1, 10, 100, 1000, 10000
			int idx = 0; 
			//int max=num2[0]; // 3개 이상의 수를 비교하기 위해 새로운 변수를 선언
			// 배열의 첫번째값을 max로 할당
			
			int max = -1; // 맥스의 값을 원소의 값과 비교하며 업데이트하기 위해 작은 수를 초기값으로 입력
			for ( int i = 0; i<10; i++ ) // i=1
			{
				if ( num2[i] > max) // num2[1] > max
				{
					max = num2[i]; // 1 > -1 만족하면 max = 1 -> max = 10 ... -> ...
					idx = i; // max를 갱신하면 첨자를 백업해두자
				}
				
				else
				{
					//max의 값이 최댓값이 맞아서 max의 값을 갱신하지 않음
					// -1 > -2
					
				}
				
				
			}
			
		
		
	}

}
