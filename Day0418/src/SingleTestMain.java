
class SingleTest {
	
	private static SingleTest s = new SingleTest();
	private int x;
	private int y;
	
	private SingleTest() {
		x = 10;
		y = 20;
	}
	
	public static SingleTest getSingleTest() {
		return s;
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
}



public class SingleTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 생성자가 private이기 때문에 클래스 밖에서 객체생성이 불가능하다
		// SingleTest t = new SingleTest();
		
		SingleTest t = SingleTest.getSingleTest();
		System.out.println("x = " + t.getX());
		System.out.println("y = " + t.getY());
	}

}
