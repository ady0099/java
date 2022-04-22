package hi;

public class PointMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point();
		//p.x=5;
		p.setX(5); 
		//setX()가 public이라 PointMain클래스에서 접근이 가능하며, 
		//해당 함수는 x값을 세팅해주는 역할을 함
		
		p.y=10;
		System.out.println(p.getX());
		System.out.println(p.y);
	}

}
