class InitTest
{
	
	int x = 5;
	static int y = 5;
	String str = "aaa";
	
	static {
		System.out.println("static �ʱ�ȭ ��� ������ \ny = " + y);
		y = 10;
		
	}
	{
		System.out.println("�ʱ�ȭ ��� ������ \nx = " + x);
		System.out.println("y = " + y);
		System.out.println("str = " + str);
		x = 20;
		y = 20;
		str = "bbb";
		
	}
	
	InitTest(){
		System.out.println("������ ������ \nx = " + x);
		System.out.println("y = " + y);
		System.out.println("str = " + str);
		x = 30;
		y = 30;
		str = "ccc";
		
	}
	
	void print() {
		System.out.println("��� �ʱ�ȭ �� \nx = " + x);
		System.out.println("y = " + y);
		System.out.println("str = " + str);
	}
}


public class InitTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			InitTest t = new InitTest();
			t.print();
	}

}
