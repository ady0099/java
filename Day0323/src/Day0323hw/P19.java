package Day0323hw;

public class P19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[10];
		int key = 8;
		//초기화
		
		for ( int i= 0; i <10; i++)
		{
			a[i] =i;
		}
		
		for ( int i = 0; i<10;i++)
		{	
			System.out.println(a[i]);
			if ( key == a[i])
			{
				System.out.println("key찾음.");
				break;
			}
			
		}
	}

}
