package hello;

public class ParameterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Data d = new Data();
		d.x = 10;
		
		System.out.println("main() : x = "+ d.x);
		
		change(d);
		System.out.println("main() : x = "+ d.x);
		
		
		
		
	}

	static void change(Data d//?)
	{
		
		d.x = 100;
		System.out.println("change() : x= "+d.x);
		
	}
	
}

class Data
{
	int x;
	
}
