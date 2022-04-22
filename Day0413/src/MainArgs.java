
public class MainArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i=0; i<args.length; i++) 
		{
			System.out.print(args[i]+"\t");			
		}
		System.out.println(add(4, 5));
		
		System.out.println("---------------------------");
		
		for ( String s : args )
		{
			System.out.print(s+"\s");
		}
		System.out.println("\s"+9);	
		
		for ( String a : args) 
//		 향상된 for문
		{
			System.out.print(a+"\s");
		}
		System.out.println("\s"+9);
		System.out.println("---------------------------");
		
		for ( String b : args)
		{
			String q = b;
			System.out.print(q+"\s");
			
			
		}
		System.out.println("\s"+9);
		System.out.println("---------------------------");
		
		
		int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		for ( int i : array)
		{
			System.out.print(i+"\s");
		}
		System.out.println();
		System.out.println("---------------------------");
		
		//		
		//		
		
	
		
		Point[] pointArr = 
		{ 	
					new Point(),
					new Point(),
					new Point(),
					new Point(),
					new Point()
		};
	
		
		for ( Point p : pointArr)
		{
			System.out.println(p);
			
		}
		
		
	}
	static int add(int x, int y)
	{
		return x+y;
	}
	
}

class Point{
	int x;
	int y;
	
}
