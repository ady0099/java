
public class MMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int c = 0;
		c = add( 3, 5, 22);
		System.out.println(c);
		
		int a = 9, b = 2;
		
		change(a,b);
		System.out.println(change(3, 5));
		
		a = rand();
		System.out.println(a);
		
	}

	static int add(int a, int b, int p)
	{
		int c = 0;
		c = a+b+p;
		return c;
		
	}
	
	static int[] change(int a, int b)
	{
		
		int[] c = new int[2];
		
		c[0] = b;
		c[1] = a;
//		
//		int temp = 0;
//		temp = c[0];
//		c[0] = c[1];
//		c[1] = temp;
		
		System.out.println(c[0]+""+c[1]);
		return c;
		
	}
	
	static int rand()
	{
		
		//0.0*10<=Math.random()*10<1.0*10
		
		int a = (int)(Math.random()*10);
		
		
		return a;
	}

}
