package Day0323hw;

public class P66_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 0;
		String a = "*";
		String b = "*";
		
		for (i=0; i<5; i++)
		{	
			if ( i == 0)
			{ 
				a = b;		
			}
			else
			{
				a = a + b;
			}
		
			System.out.println(a);
		}
		
	}

}
