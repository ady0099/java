package Day0323hw;

public class P13_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 15;
		int max2 = -1;
		
		if ( a > max2)
		{
			max2 = a;
			System.out.println(max2);
		}
		if ( b > max2)
		{
			max2 = b;
			System.out.println(max2);
		}
		System.out.println(max2);
		
		
		
		int[] num3 = new int[] {5, 8, 2};
		int max3 = num3[0]; // max3은 5의값을 가진 상태
		for ( int i = 0; i <3; i++)
		{
			if ( num3[i] > max3 )
			{
				max3 = num3[i];
				
			}
			else
			{
			
			}
			
			
		}		
		
				
	}

}
