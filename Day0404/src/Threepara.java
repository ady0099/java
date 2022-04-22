
public class Threepara {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int sum = add(1, 2, 3);		
		System.out.println(sum);
		
		int[] nums = {9, 4, 5};
		int sum2 = add2(nums);
		System.out.println(sum2);
	
		
		
	}
	
	static int add(int x, int y, int z)
	{
		
		return x + y + z;		
	}

	static int add2(int x[])
	{
		int sum = 0;
		for ( int i = 0; i < x.length; i++ )
		{
			sum = sum + x[i];
			
					
		}
		return sum;
		
	}
	
	
	
}
