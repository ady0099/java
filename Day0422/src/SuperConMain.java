class SuperConParent
{
	private int a;
	private int b;
	public SuperConParent(int a, int b)
	{
		System.out.println("SuperConParent税 持失切");
		this.a = a;
		this.b = b;
		
	}
	public void print()
	{
		System.out.println("a = "+a +", b = "+b);
	}
}
class SuperConChild extends SuperConParent
{
	
	private int c;
	public SuperConChild(int a, int b, int c)
	{
		super(a, b);
		System.out.println("SuperConChild税 持失切");
		this.c = c;
	}
	public void print()
	{
		super.print();
		System.out.println("c = " +c);
	}
	
}

public class SuperConMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperConChild scc = new SuperConChild(1, 2, 3);
		scc.print();
		
		
	}

}
