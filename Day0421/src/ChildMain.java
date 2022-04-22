
public class ChildMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent2 p = new Child2();
		System.out.println("p.x="+p.x);
		
		Child2 c = new Child2();
		System.out.println("c.x="+c.x);
		
		System.out.println("\n--------------\n");
		
		System.out.print("p.add : "); p.add();
		System.out.print("c.add : "); c.add();
		System.out.print("c.sub : "); c.sub();
		
		
	}

}

class Child2 extends Parent2
{
	int x = 100;
	void method()
	{
		System.out.println("child method");
	}
	void sub()
	{
		x = x - 1;
		System.out.println("x = "+x);
	}
	
}

class Parent2
{
	int x = 200;
	void method()
	{
		System.out.println("parent method");
	}
	void add()
	{
		x = x + 1;
		System.out.println("x = "+x);
	}
}