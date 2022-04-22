
public class PointMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point();
		System.out.println("main() 1. "+p.x + "/"+p.y);
		p.x = 5;
		p.y = 6;
		
		System.out.println("main() 2. "+p.x + "/"+p.y);
		Point p2 = new Point(5, 6);
		System.out.println("main() 3. "+p2.x+"/"+p2.y);
		
	}

}

class Point
{
	int x;
	int y;
	
	
	//default 생성자
	//클래스 이름과 동일한 함수명 생성자
	Point()
	{	
		System.out.println("1. "+x+"/"+y);
	
	}
	
	
	//파라미터 2개 생성자.//함수오버로딩
	Point(int a, int b)
	{
		System.out.println("2. "+x+"/"+y);
		x = a;
		y = b;
		System.out.println("3. "+x+"/"+y);
	}
	
}
