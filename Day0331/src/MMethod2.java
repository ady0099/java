
public class MMethod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 0;
		int b = 0;
	
		
		
		System.out.println(change(3, 5));
		

	
	}
	
	static int[] change(int a, int b)
	{
		
		int[] c = new int[2];
//		
//		c[0] = b;
//		c[1] = a;
//		
		int temp = 0;
		temp = c[0];
		c[0] = c[1];
		c[1] = temp;
		
		System.out.print(c[0]+" "+c[1]);
		return c;

	}

}
