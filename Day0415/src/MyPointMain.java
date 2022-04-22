
public class MyPointMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 정수값 좌표를 표현하는 MyPoint 클래스 작성
		// 좌표축의 범위는 0-100
		
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
			System.out.println("0-100 사이의 수만 가능합니다");
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
	
	MyPoint(int px, int py) // 초기 좌표를 지정
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
	int getX()  // x좌표 얻어옴
	{
		return x;
	}
	int getY()  // y좌표 얻어옴
	{
		return y;
	}
	
		
}