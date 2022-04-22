
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a;
		
		Testco t = new Testco();
		
		System.out.println(t.add(3, 4));
		System.out.println(t.add(5.6f,4.9f));
	
		
	}
}

class Testco {
	
	
	int add( int x, int y)
	{
		return x + y ;	
	}
	
	float add(float x, float y)
	{
		return x + y;
	}
	String add(String x, String y)
	{
		return x + y;
		
	}


	
	
}