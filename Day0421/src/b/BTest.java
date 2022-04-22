package b;

/*	public int a;
	protected int b;
	int c;
	private int d;
*/

public class BTest extends a.ATest {
	a.ATest test = new a.ATest();
	{
		test.a = 5; 
//		test.b = 4;
		
		System.out.println(a);
		System.out.println(b);
		//System.out.println(c);
	}
	
	
}
