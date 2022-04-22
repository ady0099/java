package hi;

public class Person {
	private int a;
	protected int b;
	int c;
	public int d;
	
	void add()
	{
		a=3;
		
	}
}

class Student
{
	Person p = new Person();
	
	Student()
	{
		// 같은 패키지 안에 있는 b, c, d는 사용할 수 있음 / p.b, p.c, p.d
		
		
	}
	
}