package hello;

public class MinMaxMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 11번 문제
		
		int[] a = new int[] {10, 89, 100, 3, 56};
		MyData ret = minMax(a);
		System.out.println(ret.max);
		System.out.println(ret.min);
		
		
	}
	
	static MyData minMax(int[] array)
	{
		// 최대값과 최소값을 구해서
		MyData data = new MyData();
		data.max = array[0];
		data.min = array[0];
		
		for( int i = 0; i < array.length; i++)
		{
			if ( array[i] > data.max )
			{
				data.max = array[i];
					
			}
			
			if( array[i] < data.min)
			{
				data.min = array[i];
			}
		}
		
		return data;
	
	}
	
}

class MyData
{
	int min;
	int max;
	
	
}