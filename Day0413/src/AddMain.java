
public class AddMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Add a = new Add();
		System.out.println("int형 param 2개의 add()호출 : " + a.add(3, 5));
		System.out.println("int형 param 3개의 add()호출 : " + a.add(3,  5, 4));
		System.out.println("float형 add() 호출 : " + a.add(3.4f, 4.7f));
		System.out.println("String형 add()호출 : " + a.add("aaa", "bbb"));
		
	}

}

class Add
{
	int add(int x, int y)
	{
		return x + y;
	}
	
	float add(float x, float y)
	{
		return x + y;
		
	}
	
	String add(String x, String y)
	{
		return x + y;
	}
	
	int add(int x, int y, int z)
	{
		return x + y + z;
	}
	
	
}