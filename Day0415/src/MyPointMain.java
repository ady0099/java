
public class MyPointMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ������ ��ǥ�� ǥ���ϴ� MyPoint Ŭ���� �ۼ�
		// ��ǥ���� ������ 0-100
		
		MyPoint m = new MyPoint();
		System.out.println(m.x+"/"+m.y);
		System.out.println(m.getX()+"/"+m.getY());
		m.setX(5);
		m.setY(6);
		System.out.println(m.getX()+"/"+m.getY());
		
		MyPoint m2 = new MyPoint(5,6);
		System.out.println(m2.getX()+"/"+m2.getY());
	
		System.out.println(m.check(5)+"/"+m.check(6));
		
	}

}

class MyPoint{
	int x;
	int y;
	
	int check ( int a )
	{ 
		int temp = 0;
		
		if ( a >=0 && a <= 100)
		{
			temp = a;
		}
		else
		{
			System.out.println("0-100 ������ ���� �����մϴ�");
			temp = 0;
		}
		return temp;
	
//		if ( !(a >=0 && a <= 100))
//		{
//			a=0; 
//		}
//		return a;
//		
		
	}
	
	MyPoint()
	{
		
	}	
	
	MyPoint(int px, int py) // �ʱ� ��ǥ�� ����
	{
		x = check(px);
		y = check(py);
	}
		
	void setX(int px)
	{
		x = check(px);
	}
	void setY(int py)
	{
		y = check(py);
	}
	int getX()  // x��ǥ ����
	{
		return x;
	}
	int getY()  // y��ǥ ����
	{
		return y;
	}
	
		
}