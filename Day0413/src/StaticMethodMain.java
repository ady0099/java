class StaticMethod
{
	static int a;
	int b;
	static double c;
	
	static void test(int x)
	{
		int sum = 0;
		//sum = a + b + x;
		double sumC = 0;
		sum = a + x;
		sumC = a + x + c;
		System.out.println(sum);
		System.out.println(sumC);
//		teast();
		test2();
		test3();
	}
	
	void teast()
	{
		System.out.println("teast");
	}
	
	static void test2()
	{
		System.out.println("Å×½ºÆ®");
	}
	static void test3()
	{
		System.out.println("test3");
	}
	
}

public class StaticMethodMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMethod sm = new StaticMethod();
		StaticMethod.a = 10;
		StaticMethod.c = 5.53;
		sm.b = 20;
		StaticMethod.test(30);
		
		
		
	}

}
